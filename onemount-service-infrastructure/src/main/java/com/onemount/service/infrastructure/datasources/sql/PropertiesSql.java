package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "PROPERTIES")
public class PropertiesSql extends BaseModel {

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

    private SectorsSql sector;

    private ProjectSql project;

    private PropertyAddressSql propertyAddress;

    private List<PropertyGalleriesSql> propertyGalleries;

    private List<OwnersSql> owners;

    @ManyToOne
    @JoinColumn(name = "sector_id", referencedColumnName = "sector_id")
    public SectorsSql getSector() {
        return sector;
    }

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
    public ProjectSql getProject() {
        return project;
    }

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    public PropertyAddressSql getPropertyAddress() {
        return propertyAddress;
    }

    @OneToMany(mappedBy = "property")
    public List<PropertyGalleriesSql> getPropertyGalleries() {
        return propertyGalleries;
    }

    @ManyToMany(mappedBy = "properties")
    public List<OwnersSql> getOwners() {
        return owners;
    }

    @Id
    @Column(name = "property_id", nullable = false, length = 200)
    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    @Basic
    @Column(name = "project_name", nullable = true, length = 200)
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "balcony_view", nullable = true, length = 200)
    public String getBalconyView() {
        return balconyView;
    }

    public void setBalconyView(String balconyView) {
        this.balconyView = balconyView;
    }

    @Basic
    @Column(name = "property_type", nullable = true, length = 200)
    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    @Basic
    @Column(name = "number_of_bedrooms", nullable = true)
    public BigDecimal getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(BigDecimal numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    @Basic
    @Column(name = "number_of_bathrooms", nullable = true)
    public BigDecimal getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(BigDecimal numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Basic
    @Column(name = "position", nullable = true, length = 200)
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "property_description", nullable = true, length = 200)
    public String getPropertyDescription() {
        return propertyDescription;
    }

    public void setPropertyDescription(String propertyDescription) {
        this.propertyDescription = propertyDescription;
    }

    @Basic
    @Column(name = "view", nullable = true, length = 200)
    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    @Basic
    @Column(name = "number_balcony_living", nullable = true)
    public Integer getNumberBalconyLiving() {
        return numberBalconyLiving;
    }

    public void setNumberBalconyLiving(Integer numberBalconyLiving) {
        this.numberBalconyLiving = numberBalconyLiving;
    }

    @Basic
    @Column(name = "number_balcony_bedroom", nullable = true)
    public Integer getNumberBalconyBedroom() {
        return numberBalconyBedroom;
    }

    public void setNumberBalconyBedroom(Integer numberBalconyBedroom) {
        this.numberBalconyBedroom = numberBalconyBedroom;
    }

    @Basic
    @Column(name = "number_balcony", nullable = true)
    public BigDecimal getNumberBalcony() {
        return numberBalcony;
    }

    public void setNumberBalcony(BigDecimal numberBalcony) {
        this.numberBalcony = numberBalcony;
    }

    @Basic
    @Column(name = "door_direction", nullable = true, length = 200)
    public String getDoorDirection() {
        return doorDirection;
    }

    public void setDoorDirection(String doorDirection) {
        this.doorDirection = doorDirection;
    }

    @Basic
    @Column(name = "total_price", nullable = true, length = 200)
    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Basic
    @Column(name = "total_area", nullable = true, length = 200)
    public Integer getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Integer totalArea) {
        this.totalArea = totalArea;
    }

    @Basic
    @Column(name = "image_url", nullable = true, length = 200)
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
