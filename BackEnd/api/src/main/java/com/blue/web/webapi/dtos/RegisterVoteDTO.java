package com.blue.web.webapi.dtos;

import com.blue.web.application.domain.entity.Enterprise;
import com.blue.web.application.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterVoteDTO {

    private User user;

    private Enterprise enterprise;
}
