package cn.suius.dance.service;

import cn.suius.dance.mapper.UserMapper;
import cn.suius.dance.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUserName(username);
    }
}
