package org.linzzxz.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.linzzxz.shortlink.admin.dao.entity.UserDO;
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
     * @param username
     * @return 存在：True；不存在：False
     */
    boolean hasUserName(String username);
}
