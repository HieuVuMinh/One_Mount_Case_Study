package com.onemount.service.application.controllers.dto.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyAddressDto {

    private String addressId;
    private String addressNumber;
    private String wardName;
    private String districtName;
    private String cityName;
    private Integer latitude;
    private Integer longitude;
}
