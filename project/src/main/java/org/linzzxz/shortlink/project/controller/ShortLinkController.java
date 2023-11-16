package org.linzzxz.shortlink.project.controller;

import lombok.RequiredArgsConstructor;
import org.linzzxz.shortlink.project.common.convention.result.Result;
import org.linzzxz.shortlink.project.common.convention.result.Results;
import org.linzzxz.shortlink.project.dto.req.ShortLinkCreateReqDTO;
import org.linzzxz.shortlink.project.dto.resp.ShortLinkCreateRespDTO;
import org.linzzxz.shortlink.project.service.ShortLinkService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接控制层
 */
@RestController
@RequiredArgsConstructor
public class ShortLinkController {

    private final ShortLinkService shortLinkService;

    /**
     * 创建短链接
     */
    @PostMapping("/api/short-link/v1/create")
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
        return Results.success(shortLinkService.createShortLink(requestParam));
    }
}