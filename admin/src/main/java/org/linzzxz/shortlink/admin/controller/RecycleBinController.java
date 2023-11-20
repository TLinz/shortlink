package org.linzzxz.shortlink.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.RequiredArgsConstructor;
import org.linzzxz.shortlink.admin.common.convention.result.Result;
import org.linzzxz.shortlink.admin.common.convention.result.Results;
import org.linzzxz.shortlink.admin.remote.dto.ShortLinkRemoteService;
import org.linzzxz.shortlink.admin.remote.dto.req.RecycleBinSaveReqDTO;
import org.linzzxz.shortlink.admin.remote.dto.req.ShortLinkRecyclePageReqDTO;
import org.linzzxz.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import org.linzzxz.shortlink.admin.service.RecycleBinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 回收站控制层
 */

@RestController
@RequiredArgsConstructor
public class RecycleBinController {

    // TODO 后续重构为SpringCloud Feign调用
    ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {};

    private final RecycleBinService recycleBinService;

    /**
     * 短链接添加至回收站
     */
    @PostMapping("/api/short-link/admin/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        shortLinkRemoteService.saveRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 分页查询回收站短链接
     */
    @GetMapping("/api/short-link/admin/v1/recycle-bin/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkRecyclePageReqDTO requestParam) {
        return recycleBinService.pageRecycleBinShortLink(requestParam);
    }
}
