package br.com.authapi.service.impl;

import br.com.authapi.model.User;
import br.com.authapi.repository.UserRepository;
import br.com.authapi.security.MyToken;
import br.com.authapi.security.TokenUtil;
import br.com.authapi.service.IUserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public MyToken userLogin(User user) {
        User storedUser = userRepository.findByUsername(user.getUsername()).orElseThrow(() -> new RuntimeException("User not found."));
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder.matches(user.getPassword(), storedUser.getPassword())) {
            return TokenUtil.encode(storedUser);
        }
        throw new RuntimeException("Invalid credentials");
    }

}
