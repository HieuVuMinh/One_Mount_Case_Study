package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProjectSql extends BaseModel {

    @Id
    private String projectId;
    private String projectName;
    private String constructYear;
    private BigDecimal totalArea;
    private Timestamp timestamp;
    private String developerName;
    private String projectDescription;
    private String projectHighlight;
    private Integer numberSector;
    private Integer numberProperty;
    private String designerName;

    @OneToOne
    private ProjectAddressSql projectAddress;

    @OneToMany
    private List<ProjectGallerySql> galleries;

    @OneToMany
    private List<PropertiesSql> properties;

    @OneToMany
    private List<SectorsSql> sectors;

}
