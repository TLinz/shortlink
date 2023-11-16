package org.linzzxz.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.linzzxz.shortlink.admin.dao.entity.GroupDO;
import org.linzzxz.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import org.linzzxz.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * 短链接分组接口层
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接分组
     *
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);

    /**
     * 查询用户短链接分组集合
     *
     * @return 短链接用户分组集合
     */
    List<ShortLinkGroupRespDTO> listGroup();

    /**
     * 修改短链接分组名
     *
     * @param requestParam 修改短链接分组参数
     */
    void updateGroup(ShortLinkGroupUpdateReqDTO requestParam);

    /**
     * 删除短链接分组
     *
     * @param gid 短链接分组标识
     */
    void deleteGroup(String gid);
}
