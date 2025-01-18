package net.nishinoya.journalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.nishinoya.journalApp.entity.User;
import net.nishinoya.journalApp.service.UserService;

@RestController
@RequestMapping("/public")
public class PublicController {

        @Autowired
    private UserService userService;

        @PostMapping("create-user")
    public void createUser(@RequestBody User user){
        userService.saveUser(user);
    }
}