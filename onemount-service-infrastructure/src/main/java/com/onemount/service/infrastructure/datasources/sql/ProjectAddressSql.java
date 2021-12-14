package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PROJECT_ADDRESS")
public class ProjectAddressSql extends BaseModel {


    private String addressId;
    private String wardName;
    private String districtName;
    private String cityName;
    private Integer latitude;
    private Integer longitude;
    private ProjectSql projectSql;

    @OneToOne(mappedBy = "projectAddress")
    public ProjectSql getProjectSql() {
        return projectSql;
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
    @Column(name = "ward_name", nullable = true, length = 100)
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
    @Column(name = "city", nullable = true, length = 200)
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
