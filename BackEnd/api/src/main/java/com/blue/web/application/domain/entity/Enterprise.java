package com.blue.web.application.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

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

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Image image;

    @OneToMany(mappedBy = "enterprise", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Vote> vote;
}
