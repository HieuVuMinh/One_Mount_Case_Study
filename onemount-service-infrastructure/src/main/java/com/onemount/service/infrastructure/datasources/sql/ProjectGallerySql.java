package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PROJECT_GALLERY")
public class ProjectGallerySql extends BaseModel {


    private String galleryId;
    private String category;
    private String url;

    private ProjectSql project;

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "project_id", nullable = false)
    public ProjectSql getProject() {
        return project;
    }

    public void setProject(ProjectSql project) {
        this.project = project;
    }

    @Id
    @Column(name = "gallery_id", nullable = false)
    public String getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(String galleryId) {
        this.galleryId = galleryId;
    }

    @Basic
    @Column(name = "category", nullable = true, length = 200)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 200)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
