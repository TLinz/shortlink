package org.linzzxz.shortlink.admin.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.linzzxz.shortlink.admin.common.convention.result.Result;
import org.linzzxz.shortlink.admin.remote.dto.ShortLinkRemoteService;
import org.linzzxz.shortlink.admin.remote.dto.req.ShortLinkCreateReqDTO;
import org.linzzxz.shortlink.admin.remote.dto.req.ShortLinkPageReqDTO;
import org.linzzxz.shortlink.admin.remote.dto.resp.ShortLinkCreateRespDTO;
import org.linzzxz.shortlink.admin.remote.dto.resp.ShortLinkGroupCountQueryRespDTO;
import org.linzzxz.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 短链接后管控制层
 */
@RestController
public class ShortLinkController {

    // TODO 后续重构为SpringCloud Feign调用
    ShortLinkRemoteService shortLinkRemoteService = new ShortLinkRemoteService() {};

    /**
     * 创建短链接
     */
    @PostMapping("/api/short-link/admin/v1/create")
    public Result<ShortLinkCreateRespDTO> createShortLink(@RequestBody ShortLinkCreateReqDTO requestParam) {
        return shortLinkRemoteService.createShortLink(requestParam);
    }

    /**
     * 分页查询短链接
     */
    @GetMapping("/api/short-link/admin/v1/page")
    public Result<IPage<ShortLinkPageRespDTO>> pageShortLink(ShortLinkPageReqDTO requestParam) {
        return shortLinkRemoteService.pageShortLink(requestParam);
    }

    /**
     * 查询指定分组短链接数量
     */
    @GetMapping("/api/short-link/admin/v1/count")
    public Result<List<ShortLinkGroupCountQueryRespDTO>> listGroupShortLinkCount(@RequestParam("gidList") List<String> gidList) {
        return shortLinkRemoteService.listGroupShortLinkCount(gidList);
    }
}
