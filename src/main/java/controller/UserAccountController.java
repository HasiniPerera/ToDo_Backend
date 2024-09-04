package controller;

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

}
