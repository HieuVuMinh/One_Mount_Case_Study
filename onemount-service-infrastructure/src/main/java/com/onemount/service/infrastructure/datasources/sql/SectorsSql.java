package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "SECTORS")
public class SectorsSql extends BaseModel {
    private String id;
    private String sectorName;
    private String sectorCode;
    private Integer numberProperty;
    private String sectorGalleries;

    private ProjectSql project;

    private List<PropertiesSql> properties;

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "project_id")
    public ProjectSql getProject() {
        return project;
    }

    @OneToMany(mappedBy = "sector")
    public List<PropertiesSql> getProperties() {
        return properties;
    }

    @Id
    @Column(name = "sector_id", nullable = false, length = 200)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sector_name", nullable = true, length = 200)
    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    @Basic
    @Column(name = "sector_code", nullable = true, length = 200)
    public String getSectorCode() {
        return sectorCode;
    }

    public void setSectorCode(String sectorCode) {
        this.sectorCode = sectorCode;
    }

    @Basic
    @Column(name = "number_property", nullable = true)
    public Integer getNumberProperty() {
        return numberProperty;
    }

    public void setNumberProperty(Integer numberProperty) {
        this.numberProperty = numberProperty;
    }

    @Basic
    @Column(name = "sector_galleries", nullable = true, length = 200)
    public String getSectorGalleries() {
        return sectorGalleries;
    }

    public void setSectorGalleries(String sectorGalleries) {
        this.sectorGalleries = sectorGalleries;
    }

}
