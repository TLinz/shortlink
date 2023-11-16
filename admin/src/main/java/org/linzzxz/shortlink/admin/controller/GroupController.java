package org.linzzxz.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.linzzxz.shortlink.admin.common.convention.result.Result;
import org.linzzxz.shortlink.admin.common.convention.result.Results;
import org.linzzxz.shortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import org.linzzxz.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import org.linzzxz.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;
import org.linzzxz.shortlink.admin.service.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    /**
     * 新增短链接分组
     */
    @PostMapping("/api/short-link/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }

    /**
     * 获取当前用户短链接分组列表
     */
    @GetMapping("/api/short-link/v1/group")
    public Result<List<ShortLinkGroupRespDTO>> listGroup() {
        return Results.success(groupService.listGroup());
    }

    /**
     * 修改短链接分组名
     */
    @PutMapping("/api/short-link/v1/group")
    public Result<Void> updateGroup(@RequestBody ShortLinkGroupUpdateReqDTO requestParam) {
        groupService.updateGroup(requestParam);
        return Results.success();
    }

    /**
     * 删除短链接分组名
     */
    @DeleteMapping("/api/short-link/v1/group")
    public Result<Void> deleteGroup(@RequestParam String gid) {
        groupService.deleteGroup(gid);
        return Results.success();
    }
}
