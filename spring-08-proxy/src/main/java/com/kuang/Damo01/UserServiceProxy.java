package com.kuang.Damo01;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();

    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void query() {
        log("query");
        userService.query();

    }

    @Override
    public void modify() {
        log("Modify");
        userService.modify();

    }
    public void log(String msg)
    {
        System.out.println("执行了"+ msg +"方法");
    }
}
