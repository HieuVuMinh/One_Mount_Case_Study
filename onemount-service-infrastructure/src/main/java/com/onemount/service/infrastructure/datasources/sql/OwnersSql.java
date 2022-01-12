package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class OwnersSql extends BaseModel {

    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    @ManyToMany
    private List<PropertiesSql> properties;

}
