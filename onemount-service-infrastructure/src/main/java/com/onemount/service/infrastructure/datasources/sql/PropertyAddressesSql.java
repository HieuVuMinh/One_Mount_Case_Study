package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "PROPERTY_ADDRESSES")
public class PropertyAddressesSql extends BaseModel {
    private long id;
    private String addressNumber;
    private String wardName;
    private String districtName;
    private String cityName;
    private BigDecimal latitude;
    private BigDecimal longitude;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "latitude", nullable = true, precision = 2)
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longtitude", nullable = true, precision = 2)
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

}
