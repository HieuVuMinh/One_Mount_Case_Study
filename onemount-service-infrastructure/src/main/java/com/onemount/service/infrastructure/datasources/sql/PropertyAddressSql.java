package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "PROPERTY_ADDRESS")
public class PropertyAddressSql extends BaseModel {
    private String addressId;
    private String addressNumber;
    private String wardName;
    private String districtName;
    private String cityName;
    private Integer latitude;
    private Integer longitude;
    private PropertiesSql propertiesSql;

    @OneToOne(mappedBy = "propertyAddress")
    public PropertiesSql getPropertiesSql() {
        return propertiesSql;
    }

    @Id
    @Column(name = "address_id", nullable = false)
    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "address_number", nullable = true, length = 200)
    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    @Basic
    @Column(name = "ward_name", nullable = true, length = 200)
    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    @Basic
    @Column(name = "district_name", nullable = true, length = 200)
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @Basic
    @Column(name = "city_name", nullable = true, length = 200)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "latitude", nullable = true)
    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude", nullable = true)
    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

}
