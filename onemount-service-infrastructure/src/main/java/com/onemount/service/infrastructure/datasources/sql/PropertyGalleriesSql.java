package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PropertyGalleriesSql extends BaseModel {

    @Id
    private String id;
    private String mediaType;
    private String category;
    private String urls;

    @ManyToOne
    private PropertiesSql property;

}
