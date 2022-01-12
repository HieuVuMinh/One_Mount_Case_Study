package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProjectGallerySql extends BaseModel {

    @Id
    private String galleryId;
    private String category;
    private String url;

    @ManyToOne
    private ProjectSql project;

}
