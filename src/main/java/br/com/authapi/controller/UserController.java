package br.com.authapi.controller;

import br.com.authapi.model.User;
import br.com.authapi.service.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(User user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

}
