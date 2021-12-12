package com.onemount.service.business.domain.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyAddress {

        private String id;
        private String wardName;
        private String districtName;
        private String cityName;
        private Number latitude;
        private Number longitude;
}
