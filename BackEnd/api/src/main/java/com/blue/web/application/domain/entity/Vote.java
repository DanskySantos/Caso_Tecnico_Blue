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
public class Vote extends Entity {

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    private Enterprise enterprise;
}
