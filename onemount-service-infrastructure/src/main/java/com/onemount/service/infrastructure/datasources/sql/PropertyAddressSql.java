package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class PropertyAddressSql extends BaseModel {

    @Id
    private String addressId;
    private String addressNumber;
    private String wardName;
    private String districtName;
    private String cityName;
    private Integer latitude;
    private Integer longitude;

    @OneToOne
    private PropertiesSql propertiesSql;

}
