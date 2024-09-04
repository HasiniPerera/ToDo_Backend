package com.to_do.todo_backend.controller;

import com.to_do.todo_backend.model.UserAccount;
import com.to_do.todo_backend.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")

public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;

    @GetMapping
    public List<UserAccount> getAllUsers() {
        return userAccountService.getAllUsers();
    }

    @PostMapping
    public UserAccount createUser(@RequestBody UserAccount userAccount) {
        return userAccountService.createUser(userAccount);
    }

    @GetMapping("/{id}")
    public UserAccount getUserById(@PathVariable int id) {
        return userAccountService.getUserById(id);
    }

    @PutMapping("/{id}")
    public UserAccount updateUser(@PathVariable int id, @RequestBody UserAccount userAccountDetails) {
        return userAccountService.updateUser(id, userAccountDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userAccountService.deleteUser(id);
    }
}
