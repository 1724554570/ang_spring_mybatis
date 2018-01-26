package org.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import org.core.entity.Users;
import org.core.idao.UsersMapper;
import org.core.service.UsersService;

@Service("userService")
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    public Users getUserById(int userid) {
        return usersMapper.selectByPrimaryKey(userid);
    }
}
