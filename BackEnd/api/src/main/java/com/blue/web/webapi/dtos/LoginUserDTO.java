package com.blue.web.webapi.dtos;

import com.blue.web.application.domain.entity.Vote;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserDTO {
    private String name;
    private String email;
    private String password;
    private Vote vote;
}
