package com.to_do.todo_backend.service;

import com.to_do.todo_backend.model.UserAccount;

import java.util.List;

public interface UserAccountService {

    List<UserAccount> getAllUsers();

    UserAccount getUserById(int id);

    UserAccount createUser(UserAccount userAccount);

    UserAccount updateUser(int id, UserAccount  userAccountDetails);

    void deleteUser(int id);

}
