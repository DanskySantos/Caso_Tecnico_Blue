package com.blue.web.webapi.dtos;

import com.blue.web.application.domain.entity.Image;
import com.blue.web.application.domain.entity.Vote;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnterpriseDTO {
    private String name;
    private Image image;
}
