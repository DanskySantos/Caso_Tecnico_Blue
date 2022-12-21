package com.blue.web.application.domain.entity;

import com.sun.istack.NotNull;
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

    @OneToOne(mappedBy = "vote", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Users user;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "enterprise_id")
    private Enterprise enterprise;
}
