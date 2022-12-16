package com.blue.web.webapi.controllers;


import com.blue.web.services.UserService;
import com.blue.web.webapi.dtos.RegisterUserDTO;
import com.blue.web.webapi.dtos.StandardAnswerDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/user")
    public StandardAnswerDTO registerUser(@RequestBody RegisterUserDTO registerUserDTO) {

        if (StringUtils.isEmpty(registerUserDTO.getName()))
            throw new RuntimeException("Name should not be null!");
        if (StringUtils.isEmpty(registerUserDTO.getEmail()))
            throw new RuntimeException("Email should not be null!");

        this.userService.register(registerUserDTO);

        return new StandardAnswerDTO(true, "User Registered!");
    }

    @GetMapping(value = "/user")
    public StandardAnswerDTO retrieveUser(@RequestBody RegisterUserDTO registerUserDTO) {

        if (StringUtils.isEmpty(registerUserDTO.getEmail()))
            throw new RuntimeException("Email should not be null!");

        this.userService.retrieve(registerUserDTO);

        return new StandardAnswerDTO(true, "Got it!");
    }
}
