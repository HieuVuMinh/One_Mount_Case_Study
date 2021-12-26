package com.onemount.service.application.controllers.dto.property;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PropertyDto {

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
    private Double totalPrice;
    private Integer totalArea;
    private String imageUrl;

    private SectorDto sector;

    private PropertyAddressDto propertyAddress;

    private List<PropertyGalleryDto> propertyGalleries;

}
