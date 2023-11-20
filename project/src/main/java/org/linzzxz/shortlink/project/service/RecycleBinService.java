package org.linzzxz.shortlink.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.linzzxz.shortlink.project.dao.entity.ShortLinkDO;
import org.linzzxz.shortlink.project.dto.req.RecycleBinSaveReqDTO;

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
}
