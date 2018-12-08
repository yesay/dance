package cn.suius.dance.service;

import cn.suius.dance.model.User;

public interface UserService {

    User findByUsername(String username);

}
