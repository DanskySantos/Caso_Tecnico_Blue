package com.blue.web.application.domain.entity;

import lombok.*;

import javax.persistence.*;

@javax.persistence.Entity
@Table
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends Entity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToOne(fetch = FetchType.LAZY)
    private Vote vote;
}
