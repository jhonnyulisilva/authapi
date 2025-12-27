package br.com.authapi.service.impl;

import br.com.authapi.model.User;
import br.com.authapi.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

}
