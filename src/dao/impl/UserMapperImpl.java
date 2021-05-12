package dao.impl;

import dao.UserMapper;
import entity.User;

public class UserMapperImpl implements UserMapper {
    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public User findByGUID(String GUID) {
        return null;
    }
}
