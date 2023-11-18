package org.linzzxz.shortlink.admin.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.linzzxz.shortlink.admin.common.biz.user.UserContext;
import org.linzzxz.shortlink.admin.dao.entity.GroupDO;
import org.linzzxz.shortlink.admin.dao.mapper.GroupMapper;
import org.linzzxz.shortlink.admin.dto.req.ShortLinkGroupSortReqDTO;
import org.linzzxz.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import org.linzzxz.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;
import org.linzzxz.shortlink.admin.remote.dto.ShortLinkRemoteService;
import org.linzzxz.shortlink.admin.remote.dto.resp.ShortLinkGroupCountQueryRespDTO;
import org.linzzxz.shortlink.admin.service.GroupService;
import org.linzzxz.shortlink.admin.toolkit.RandomGenerator;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 短链接分组接口实现层
 */
@Slf4j
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {

    // TODO 后续重构为SpringCloud Feign调用
    ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {};

    @Override
    public void saveGroup(String groupName) {
        String gid;
        while (true) {
            gid = RandomGenerator.generateRandomString();
            if (genGid(gid)) {
                break;
            }
        }
        GroupDO groupDO = GroupDO.builder()
                .gid(gid)
                .sortOrder(0)
                .username(UserContext.getUsername())
                .name(groupName)
                .build();
        baseMapper.insert(groupDO);
    }

    @Override
    public List<ShortLinkGroupRespDTO> listGroup() {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getDelFlag, 0)
                .eq(GroupDO::getUsername, UserContext.getUsername())
                .orderByDesc(GroupDO::getSortOrder, GroupDO::getUpdateTime);
        List<GroupDO> groupDOList = baseMapper.selectList(queryWrapper);
        List<ShortLinkGroupCountQueryRespDTO> listResult = shortLinkRemoteService
                .listGroupShortLinkCount(groupDOList.stream().map(GroupDO::getGid).toList()).getData();
        List<ShortLinkGroupRespDTO> results = BeanUtil.copyToList(groupDOList, ShortLinkGroupRespDTO.class);
        Map<String, Integer> counts = listResult.stream()
                .collect(Collectors.toMap(ShortLinkGroupCountQueryRespDTO::getGid, ShortLinkGroupCountQueryRespDTO::getShortLinkCount));
        return results.stream().peek(result -> result.setShortLinkCount(counts.get(result.getGid()))).toList();
    }

    @Override
    public void updateGroup(ShortLinkGroupUpdateReqDTO requestParam) {
        LambdaQueryWrapper<GroupDO> updateWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getUsername, UserContext.getUsername())
                .eq(GroupDO::getGid, requestParam.getGid())
                .eq(GroupDO::getDelFlag, 0);
        GroupDO groupDO = new GroupDO();
        groupDO.setName(requestParam.getName());
        baseMapper.update(groupDO, updateWrapper);
    }

    @Override
    public void deleteGroup(String gid) {
        LambdaQueryWrapper<GroupDO> updateWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getUsername, UserContext.getUsername())
                .eq(GroupDO::getGid, gid)
                .eq(GroupDO::getDelFlag, 0);
        GroupDO groupDO = new GroupDO();
        groupDO.setDelFlag(1);
        baseMapper.update(groupDO, updateWrapper);
    }

    @Override
    public void sortGroup(List<ShortLinkGroupSortReqDTO> requestParam) {
        requestParam.forEach(each -> {
            GroupDO groupDO = GroupDO.builder()
                    .username(UserContext.getUsername())
                    .sortOrder(each.getSortOrder())
                    .gid(each.getGid())
                    .build();
            LambdaQueryWrapper<GroupDO> updateWrapper = Wrappers.lambdaQuery(GroupDO.class)
                    .eq(GroupDO::getUsername, UserContext.getUsername())
                    .eq(GroupDO::getGid, each.getGid())
                    .eq(GroupDO::getDelFlag, 0);
            baseMapper.update(groupDO, updateWrapper);
        });
    }

    /**
     * 尝试生成唯一Gid
     *
     * @return 生成失败：false；成功：true
     */
    private boolean genGid(String gid) {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getGid, gid)
                .eq(GroupDO::getUsername, UserContext.getUsername());
        GroupDO hasGroupFlag = baseMapper.selectOne(queryWrapper);
        return hasGroupFlag == null;
    }
}