package org.linzzxz.shortlink.project.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.linzzxz.shortlink.project.dao.entity.ShortLinkDO;
import org.linzzxz.shortlink.project.dto.req.RecycleBinSaveReqDTO;
import org.linzzxz.shortlink.project.dto.req.ShortLinkRecyclePageReqDTO;
import org.linzzxz.shortlink.project.dto.resp.ShortLinkPageRespDTO;

/**
 * 回收站管理接口层
 */
public interface RecycleBinService extends IService<ShortLinkDO> {

    /**
     * 添加短链接至回收站
     *
     * @param requestParam 添加短链接至回收站请求参数
     */
    void saveRecycleBin(RecycleBinSaveReqDTO requestParam);

    /**
     * 分页查询回收站短链接
     *
     * @param requestParam 分页查询回收站短链接请求参数
     * @return 回收站短链接分页返回结果
     */
    IPage<ShortLinkPageRespDTO> pageShortLink(ShortLinkRecyclePageReqDTO requestParam);
}
