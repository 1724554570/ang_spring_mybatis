package org.core.service;

import org.core.entity.OUsers;
import org.core.search.UserSearchParms;

public interface OUserService {

    /**
     * 登录查询
     *
     * @param oUsers
     * @return
     */
    public OUsers getLogin(OUsers oUsers);
    
    /**
     *  注册信息
     * @param oUsers
     * @return
     */
    public int insertRegister(OUsers oUsers);

    /**
     * 用户集合
     *
     * @param parms
     * @return
     */
    public UserSearchParms getUserList(UserSearchParms parms);

}
