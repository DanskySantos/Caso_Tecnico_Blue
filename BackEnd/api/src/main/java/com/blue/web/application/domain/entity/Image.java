package com.blue.web.application.domain.entity;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.File;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SequenceGenerator(name = "default_gen", sequenceName = "arquivo_id_seq", allocationSize = 1)
public class Image extends com.blue.web.application.domain.entity.Entity {

    @Type(type = "org.hibernate.type.TextType")
    private String link;

    @Transient
    private File file;

    public String getLink() {
        return link;
    }

    public void setLink(String arquivo) {
        this.link = arquivo;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
