package com.blue.web.services;

import com.blue.web.application.domain.entity.User;
import com.blue.web.infrastructure.repositories.UserRepository;
import com.blue.web.webapi.dtos.RegisterUserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(RegisterUserDTO registerUserDTO) {
        User user = new User();

        user.setEmail(registerUserDTO.getEmail());
        user.setName(registerUserDTO.getName());
        user.setPassword(registerUserDTO.getPassword());

        userRepository.save(user);
    }

    public void retrieve(RegisterUserDTO registerUserDTO) {

        userRepository.findByEmailIgnoreCase(registerUserDTO.getEmail());
    }
}
