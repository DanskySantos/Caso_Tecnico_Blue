package com.blue.web.application.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@javax.persistence.Entity
public class Image extends Entity {

    private String title;
    private String description;
    private String imagePath;
    private String imageFileName;

}