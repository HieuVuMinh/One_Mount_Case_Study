package com.onemount.service.business.domain.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sector {

    private String id;
    private String sectorName;
    private String sectorCode;
    private Integer numberProperty;
    private String sectorGalleries;
}
