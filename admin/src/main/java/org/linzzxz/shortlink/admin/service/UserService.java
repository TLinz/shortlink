package org.linzzxz.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.linzzxz.shortlink.admin.dao.entity.UserDO;
import org.linzzxz.shortlink.admin.dto.req.UserLoginReqDTO;
import org.linzzxz.shortlink.admin.dto.req.UserRegisterReqDTO;
import org.linzzxz.shortlink.admin.dto.req.UserUpdateReqDTO;
import org.linzzxz.shortlink.admin.dto.resp.UserLoginRespDTO;
import org.linzzxz.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {


    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户是否存在
     *
     * @param username 用户名
     * @return 存在：True；不存在：False
     */
    Boolean hasUserName(String username);

    /**
     * 注册用户
     *
     * @param requestParam 注册用户请求参数
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户
     *
     * @param requestParam 修改用户请求参数
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     *
     * @param requestParam 用户登录请求参数
     * @return 用户登录返回响应（Token）
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登录
     *
     * @param username 用户名
     * @param token 用户登录token
     * @return 用户是否登录标识
     */
    Boolean checkLogin(String username, String token);
}
