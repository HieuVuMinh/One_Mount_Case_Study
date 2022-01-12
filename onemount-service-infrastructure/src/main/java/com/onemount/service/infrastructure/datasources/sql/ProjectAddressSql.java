package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ProjectAddressSql extends BaseModel {

    @Id
    private String addressId;
    private String wardName;
    private String districtName;
    private String cityName;
    private BigDecimal latitude;
    private BigDecimal longitude;

    @OneToOne
    private ProjectSql projectSql;

}
