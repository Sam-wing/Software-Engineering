package controller.impl;

import controller.UserController;
import dao.UserMapper;
import dao.impl.UserMapperImpl;
import entity.User;
import entity.impl.Administrator;
import entity.impl.CandidateTeacher;
import entity.impl.ClassDirector;
import service.UserService;
import service.impl.UserServiceImpl;

public class UserControllerImpl implements UserController {

    UserService userService = new UserServiceImpl();
    UserMapper userMapper = new UserMapperImpl();

    @Override
    public void register(int id, String GUID, String password) {
        if(id == 1){
            User user = new Administrator(id,GUID,password);
            userService.register(user);
        }else if (id == 2){
            User user = new CandidateTeacher(id,GUID,password);
            userService.register(user);
        }else if(id == 3){
            User user = new ClassDirector(id,GUID,password);
            userService.register(user);
        }
    }

    @Override
    public void login(String GUID, String password) {
        if(userMapper.findByGUID(GUID) != null){
            System.out.println("welcome");
        }else{
            System.out.println("false");
        }
    }

}
