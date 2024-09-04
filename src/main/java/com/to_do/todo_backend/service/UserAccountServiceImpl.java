package com.to_do.todo_backend.service;

import com.to_do.todo_backend.model.UserAccount;
import com.to_do.todo_backend.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserAccountServiceImpl implements  UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public List<UserAccount> getAllUsers() {
        return userAccountRepository.findAll();
    }

    @Override
    public UserAccount getUserById(int id) {
        return userAccountRepository.findById(id).orElse(null);
    }

    @Override
    public UserAccount createUser(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }

    @Override
    public UserAccount updateUser(int id, UserAccount userAccountDetails) {
        UserAccount userAccount = userAccountRepository.findById(id).orElse(null);
        if (userAccount != null) {
            userAccount.setEmail(userAccountDetails.getEmail());
            userAccount.setPassword(userAccountDetails.getPassword());
            userAccount.setName(userAccountDetails.getName());
            userAccount.setTelephone(userAccountDetails.getTelephone());
            userAccount.setAge(userAccountDetails.getAge());
            return userAccountRepository.save(userAccount);
        }
        return null;
    }

    @Override
    public void deleteUser(int id) {
        userAccountRepository.deleteById(id);
    }
}
