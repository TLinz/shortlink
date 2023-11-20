package org.linzzxz.shortlink.project.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.RequiredArgsConstructor;
import org.linzzxz.shortlink.project.common.convention.result.Result;
import org.linzzxz.shortlink.project.common.convention.result.Results;
import org.linzzxz.shortlink.project.dto.req.RecycleBinSaveReqDTO;
import org.linzzxz.shortlink.project.dto.req.ShortLinkRecyclePageReqDTO;
import org.linzzxz.shortlink.project.dto.resp.ShortLinkPageRespDTO;
import org.linzzxz.shortlink.project.service.RecycleBinService;
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

    private final RecycleBinService recycleBinService;

    /**
     * 短链接添加至回收站
     */
    @PostMapping("/api/short-link/v1/recycle-bin/save")
    public Result<Void> saveRecycleBin(@RequestBody RecycleBinSaveReqDTO requestParam) {
        recycleBinService.saveRecycleBin(requestParam);
        return Results.success();
    }

    /**
     * 分页查询回收站短链接
     */
    @GetMapping("/api/short-link/v1/recycle-bin/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkRecyclePageReqDTO requestParam) {
        return Results.success(recycleBinService.pageShortLink(requestParam));
    }
}
