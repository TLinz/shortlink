package org.linzzxz.shortlink.admin.remote.dto.req;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.List;

/**
 * 回收站短链接分页查询请求参数
 */
@Data
public class ShortLinkRecyclePageReqDTO extends Page {

    /**
     * 分组标识列表
     */
    private List<String> gidList;
}
