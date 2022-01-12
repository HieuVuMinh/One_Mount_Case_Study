package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SectorsSql extends BaseModel {

    @Id
    private String id;
    private String sectorName;
    private String sectorCode;
    private Integer numberProperty;
    private String sectorGalleries;

    @ManyToOne
    private ProjectSql project;

    @OneToMany
    private List<PropertiesSql> properties;

}
