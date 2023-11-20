package org.linzzxz.shortlink.project.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import org.linzzxz.shortlink.project.dao.entity.ShortLinkDO;

import java.util.List;

/**
 * 回收站短链接分页查询请求参数
 */
@Data
public class ShortLinkRecyclePageReqDTO extends Page<ShortLinkDO> {

    /**
     * 分组标识列表
     */
    private List<String> gidList;
}
