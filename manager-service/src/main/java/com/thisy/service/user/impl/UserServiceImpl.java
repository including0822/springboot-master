package com.thisy.service.user.impl;

import com.thisy.dao.user.UserDao;
import com.thisy.entity.user.User;
import com.thisy.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User findUser(Integer dbId) {
      return  userDao.selectById(dbId);
    }
}
