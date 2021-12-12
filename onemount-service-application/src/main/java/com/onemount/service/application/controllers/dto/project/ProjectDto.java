package com.onemount.service.application.controllers.dto.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {

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

    private ProjectAddressDto projectAddress;

    private List<ProjectGalleryDto> galleries;

}
