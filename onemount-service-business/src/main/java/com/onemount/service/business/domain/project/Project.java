package com.onemount.service.business.domain.project;

import com.onemount.service.common.shared.shared.AggregateRoot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project implements AggregateRoot<Project> {

    private String projectId;
    private String projectName;
    private String constructYear;
    private BigDecimal totalArea;
    private Timestamp timestamp;
    private String developerName;
    private String developerId;
    private String projectDescription;
    private String projectHighlight;
    private Integer numberSector;
    private Integer numberBlk;
    private Integer numberProperty;
    private String designerName;

    private ProjectAddress projectAddress;

    private List<ProjectGallery> galleries;

    @Override
    public Project clone() {
        return null;
    }
}
