package com.cppba.service.impl;

import com.cppba.dao.UserDao;
import com.cppba.entity.User;
import com.cppba.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * 开发者
 * nickName:大黄蜂
 * email:245655812@qq.com
 * github:https://github.com/bigbeef
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User get(Long id) {
        return userDao.get(User.class,id);
    }
}
