package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PROPERTY_GALLERIES")
public class PropertyGalleriesSql extends BaseModel {

    private long id;
    private String mediaType;
    private String category;
    private String urls;

    private PropertiesSql property;

    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "id")
    public PropertiesSql getProperty() {
        return property;
    }

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "media_type", nullable = true, length = 200)
    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
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
    @Column(name = "urls", nullable = true, length = 200)
    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

}
