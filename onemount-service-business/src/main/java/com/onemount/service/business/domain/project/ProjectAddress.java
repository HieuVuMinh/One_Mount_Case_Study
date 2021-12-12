package com.onemount.service.business.domain.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectAddress {

    private String id;
    private String wardName;
    private String districtName;
    private String cityName;
    private Number latitude;
    private Number longitude;
}
