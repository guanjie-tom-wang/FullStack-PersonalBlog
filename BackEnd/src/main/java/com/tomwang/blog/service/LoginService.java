package com.tomwang.blog.service;

import com.tomwang.blog.dao.pojo.SysUser;
import com.tomwang.blog.vo.Result;
import com.tomwang.blog.vo.params.LoginParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author ljm
 * @Date 2021/10/12 20:04
 * @Version 1.0
 */

@Transactional
public interface LoginService {
    /**
     * 登陆功能
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    /**
     * 退出登陆
     * @param token
     * @return
     */
    Result logout(String token);


    /**
     * 注册
     * @param loginParam
     * @return
     */
    Result register(LoginParam loginParam);

}
