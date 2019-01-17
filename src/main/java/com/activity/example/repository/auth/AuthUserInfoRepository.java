package com.activity.example.repository.auth;

import com.activity.example.entity.AuthUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/***
 * 　用户信息　Repository
 */
public interface AuthUserInfoRepository extends JpaRepository<AuthUserInfo, Long>, JpaSpecificationExecutor<AuthUserInfo> {

    /**
     * 根据　userAccount　获取用户信息数据
     * @param  userAccount  账号
     * @return
     */
    AuthUserInfo findFirstByUserAccount(String userAccount);

    /**
     *  根据　userCode　获取用户信息数据
     * @param  userCode  用户编号
     * @return
     */
    AuthUserInfo findFirstByUserCode(String userCode);

    /**
     * 根据 userAccount  userPassword 获取用户信息
     * @param userAccount 账号
     * @param userPassword 密码
     * @return
     */
    AuthUserInfo findByUserAccountAndAndUserPassword(String userAccount, String userPassword);
}
