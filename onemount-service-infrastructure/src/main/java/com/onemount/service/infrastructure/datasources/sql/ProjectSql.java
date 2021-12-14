package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "PROJECTS")
public class ProjectSql extends BaseModel {

    private String projectId;
    private String projectName;
    private String constructYear;
    private BigDecimal totalArea;
    private Timestamp timestamp;
    private String developerName;
    private String projectDescription;
    private String projectHighlight;
    private Integer numberSector;
    private Integer numberProperty;
    private String designerName;

    private ProjectAddressSql projectAddress;

    private List<ProjectGallerySql> galleries;

    private List<PropertiesSql> properties;

    private List<SectorsSql> sectors;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    public ProjectAddressSql getProjectAddress() {
        return projectAddress;
    }

    @OneToMany(mappedBy = "project")
    public List<PropertiesSql> getProperties() {
        return properties;
    }

    @OneToMany(mappedBy = "project")
    public List<ProjectGallerySql> getGalleries() {
        return galleries;
    }

    @OneToMany(mappedBy = "project")
    public List<SectorsSql> getSectors() {
        return sectors;
    }

    @Id
    @Column(name = "project_id", nullable = false, length = 200)
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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
    @Column(name = "construct_year", nullable = true, length = 200)
    public String getConstructYear() {
        return constructYear;
    }

    public void setConstructYear(String constructYear) {
        this.constructYear = constructYear;
    }

    @Basic
    @Column(name = "total_area", nullable = true)
    public BigDecimal getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(BigDecimal totalArea) {
        this.totalArea = totalArea;
    }

    @Basic
    @Column(name = "timestamp", nullable = true)
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Basic
    @Column(name = "developer_name", nullable = true, length = 200)
    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    @Basic
    @Column(name = "project_description", nullable = true, length = 200)
    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    @Basic
    @Column(name = "project_highlight", nullable = true, length = 200)
    public String getProjectHighlight() {
        return projectHighlight;
    }

    public void setProjectHighlight(String projectHighlight) {
        this.projectHighlight = projectHighlight;
    }

    @Basic
    @Column(name = "number_sector", nullable = true)
    public Integer getNumberSector() {
        return numberSector;
    }

    public void setNumberSector(Integer numberSector) {
        this.numberSector = numberSector;
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
    @Column(name = "designer_name", nullable = true, length = 200)
    public String getDesignerName() {
        return designerName;
    }

    public void setDesignerName(String designerName) {
        this.designerName = designerName;
    }
}
