package br.com.authapi.service;

import br.com.authapi.model.User;

public interface IUserService {

    public User addUser(User user);
    public User getByUsername(String username);

}
