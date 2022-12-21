package com.blue.web.webapi.controllers;


import com.blue.web.services.UsersService;
import com.blue.web.webapi.dtos.LoginUserDTO;
import com.blue.web.webapi.dtos.RegisterUserDTO;
import com.blue.web.webapi.dtos.StandardAnswerDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping(value = "/register")
    public StandardAnswerDTO registerUser(@RequestBody RegisterUserDTO registerUserDTO) {

        if (StringUtils.isEmpty(registerUserDTO.getName()))
            throw new RuntimeException("Name should not be null!");
        if (StringUtils.isEmpty(registerUserDTO.getEmail()))
            throw new RuntimeException("Email should not be null!");
        if (StringUtils.isEmpty(registerUserDTO.getPassword()))
            throw new RuntimeException("Password should not be null!");

        this.usersService.register(registerUserDTO);

        return new StandardAnswerDTO(true, "User Registered!");
    }

    @PostMapping(value = "/login")
    public LoginUserDTO loginUser(@RequestBody LoginUserDTO loginUserDTO) {

        if (StringUtils.isEmpty(loginUserDTO.getEmail()))
            throw new RuntimeException("Email should not be null!");
        if (StringUtils.isEmpty(loginUserDTO.getPassword()))
            throw new RuntimeException("Password should not be null!");

        return this.usersService.login(loginUserDTO);
    }

    @GetMapping(value = "/get")
    public StandardAnswerDTO retrieveUser(@RequestBody RegisterUserDTO registerUserDTO) {

        if (StringUtils.isEmpty(registerUserDTO.getEmail()))
            throw new RuntimeException("Email should not be null!");

        this.usersService.retrieve(registerUserDTO);

        return new StandardAnswerDTO(true, "Got it!");
    }
}
