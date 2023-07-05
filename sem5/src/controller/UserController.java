package controller;

import model.User;
import service.UserService;
import service.UserServiceImpl;

import java.util.Scanner;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(String name, String lastname, long balance) {
        userService.saveUser(name, lastname, balance);
        System.out.println("User saved");
    }

    public void deleteUser(int index) {
        if (index != -1) {
            userService.deleteUser(index);
            System.out.println("Deleted has been performed");
        } else {
            System.out.println("User is null");
        }
    }

    public void getAllUsers() {
        System.out.println(userService.getAllUsers());
    }
}
