package com.onemount.service.application.controllers.dto.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SectorDto {

    private String id;
    private String sectorName;
    private String sectorCode;
    private Integer numberProperty;
    private String sectorGalleries;
}
