package service.impl;

import dao.UserMapper;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    UserMapper userMapper;

    @Override
    public void register(User user) {
        System.out.println("register successfully");
    }

    @Override
    public User login(String phone, String password) {
        System.out.println("login successfully");
        return null;
    }
}
