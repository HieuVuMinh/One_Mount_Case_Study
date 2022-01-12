package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PropertiesSql extends BaseModel {

    @Id
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
    private Double totalPrice;
    private Integer totalArea;
    private String imageUrl;

    @ManyToOne
    private SectorsSql sector;

    @ManyToOne
    private ProjectSql project;

    @OneToOne
    private PropertyAddressSql propertyAddress;

    @OneToMany
    private List<PropertyGalleriesSql> propertyGalleries;

    @ManyToMany
    private List<OwnersSql> owners;

}
