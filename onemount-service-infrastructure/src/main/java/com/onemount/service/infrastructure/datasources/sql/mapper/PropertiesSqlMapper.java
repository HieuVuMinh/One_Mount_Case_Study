package com.onemount.service.infrastructure.datasources.sql.mapper;

import com.onemount.service.business.domain.property.Properties;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import com.onemount.service.infrastructure.datasources.sql.PropertiesSql;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PropertiesSqlMapper extends IObjectMapper<Properties, PropertiesSql> {

}
