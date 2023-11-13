package org.linzzxz.shortlink.admin.controller;

import lombok.RequiredArgsConstructor;
import org.linzzxz.shortlink.admin.dto.resp.UserRespDTO;
import org.linzzxz.shortlink.admin.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/api/shortlink/v1/user/{username}")
    public UserRespDTO getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }
}
