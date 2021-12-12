package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PROJECT_ADDRESS")
public class ProjectAddressSql extends BaseModel {

    private String id;
    private String wardName;
    private String districtName;
    private String cityName;
    private Number latitude;
    private Number longitude;


    @Id
    @Column(name = "id", nullable = false)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ward", nullable = true, length = 100)
    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    @Basic
    @Column(name = "district", nullable = true, length = 200)
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @Basic
    @Column(name = "city", nullable = true, length = 200)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "latitude", nullable = true, precision = 10)
    public Number getLatitude() {
        return latitude;
    }

    public void setLatitude(Number latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude", nullable = true, precision = 10)
    public Number getLongitude() {
        return longitude;
    }

    public void setLongitude(Number longitude) {
        this.longitude = longitude;
    }
}
