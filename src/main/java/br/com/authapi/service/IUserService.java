package br.com.authapi.service;

import br.com.authapi.model.User;
import br.com.authapi.security.MyToken;

public interface IUserService {

    public User addUser(User user);
    public User getByUsername(String username);
    public MyToken userLogin(User user);

}
