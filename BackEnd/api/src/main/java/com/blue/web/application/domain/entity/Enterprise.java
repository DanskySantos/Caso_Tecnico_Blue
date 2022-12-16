package com.blue.web.application.domain.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Enterprise extends Entity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String image;
}
