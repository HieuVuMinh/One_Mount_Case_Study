package com.onemount.service.business.domain.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyAddress {

        private String addressId;
        private String addressNumber;
        private String wardName;
        private String districtName;
        private String cityName;
        private Integer latitude;
        private Integer longitude;
}
