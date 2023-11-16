package org.linzzxz.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.linzzxz.shortlink.admin.common.convention.result.Result;
import org.linzzxz.shortlink.admin.common.convention.result.Results;
import org.linzzxz.shortlink.admin.dto.req.UserLoginReqDTO;
import org.linzzxz.shortlink.admin.dto.req.UserRegisterReqDTO;
import org.linzzxz.shortlink.admin.dto.req.UserUpdateReqDTO;
import org.linzzxz.shortlink.admin.dto.resp.UserLoginRespDTO;
import org.linzzxz.shortlink.admin.dto.resp.UserRespDTO;
import org.linzzxz.shortlink.admin.service.UserService;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理控制层
 */
@RestController
// 构造器注入
@RequiredArgsConstructor
public class UserController {

    // 构造器注入
    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/short-link/admin/v1/user")
    public Result<UserRespDTO> getUserByUsername(@RequestParam("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 查询用户是否存在
     */
    @GetMapping("/api/short-link/admin/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username) {
        return Results.success(userService.hasUserName(username));
    }

    /**
     * 注册用户
     */
    @PostMapping("/api/short-link/admin/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }

    /**
     * 修改用户信息
     */
    @PutMapping("/api/short-link/admin/v1/user")
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam) {
        userService.update(requestParam);
        return Results.success();
    }

    /**
     * 用户登录
     */
    @PostMapping("/api/short-link/admin/v1/user/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam) {
        return Results.success(userService.login(requestParam));
    }

    /**
     * 检查用户是否登录
     */
    @GetMapping("/api/short-link/admin/v1/user/check-login")
    public Result<Boolean> checkLogin(@RequestParam("username") String username, @RequestParam("token") String token) {
        return Results.success(userService.checkLogin(username, token));
    }

    @DeleteMapping("/api/short-link/admin/v1/user/logout")
    public Result<Void> logout(@RequestParam("username") String username, @RequestParam("token") String token) {
        userService.logout(username, token);
        return Results.success();
    }
}
