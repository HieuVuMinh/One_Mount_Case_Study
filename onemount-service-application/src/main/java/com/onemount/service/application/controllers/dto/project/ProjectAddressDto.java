package com.onemount.service.application.controllers.dto.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectAddressDto {

    private String addressId;
    private String wardName;
    private String districtName;
    private String cityName;
    private Integer latitude;
    private Integer longitude;
}
