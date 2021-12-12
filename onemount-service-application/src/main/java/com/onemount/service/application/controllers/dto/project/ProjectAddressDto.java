package com.onemount.service.application.controllers.dto.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectAddressDto {

    private String id;
    private String wardName;
    private String districtName;
    private String cityName;
    private Number latitude;
    private Number longitude;
}
