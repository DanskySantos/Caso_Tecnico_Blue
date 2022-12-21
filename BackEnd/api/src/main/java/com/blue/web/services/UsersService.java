package com.blue.web.services;

import com.blue.web.application.domain.entity.Users;
import com.blue.web.infrastructure.repositories.UsersRepository;
import com.blue.web.webapi.dtos.LoginUserDTO;
import com.blue.web.webapi.dtos.RegisterUserDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void register(RegisterUserDTO registerUserDTO) {
        Users user = new Users();

        user.setEmail(registerUserDTO.getEmail());
        user.setName(registerUserDTO.getName());
        user.setPassword(registerUserDTO.getPassword());

        usersRepository.save(user);
    }

    public LoginUserDTO login(LoginUserDTO loginUserDTO) {
        Users users = new Users();

        if (loginUserDTO.getEmail() != null) {
            users = usersRepository.findByEmailIgnoreCase(loginUserDTO.getEmail());
        } else {
            throw new RuntimeException("Incorrect login or password! Try to Register!");
        }

        if (!StringUtils.equals(users.getPassword(), loginUserDTO.getPassword())) {
            throw new RuntimeException("Invalid password!");
        }

        if (!StringUtils.equals(users.getEmail(), loginUserDTO.getEmail())) {
            throw new RuntimeException("Invalid email!");
        }

        LoginUserDTO userToReturn = new LoginUserDTO();

        userToReturn.setEmail(users.getEmail());
        userToReturn.setName(users.getName());
        userToReturn.setPassword(users.getPassword());

        return userToReturn;
    }

    public void retrieve(RegisterUserDTO registerUserDTO) {

        usersRepository.findByEmailIgnoreCase(registerUserDTO.getEmail());
    }

}
