package com.onemount.service.business.domain.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Properties {

    private String propertyId;
    private String projectName;
    private String balconyView;
    private String propertyType;
    private BigDecimal numberOfBedrooms;
    private BigDecimal numberOfBathrooms;
    private String position;
    private String propertyDescription;
    private String view;
    private Integer numberBalconyLiving;
    private Integer numberBalconyBedroom;
    private BigDecimal numberBalcony;
    private String doorDirection;
    private String ownerId;

    @Override
    public Properties clone() {
        return null;
    }
}
