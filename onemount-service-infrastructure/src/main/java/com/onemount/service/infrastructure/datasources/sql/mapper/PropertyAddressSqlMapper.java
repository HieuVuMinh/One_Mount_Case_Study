package com.onemount.service.infrastructure.datasources.sql.mapper;

import com.onemount.service.business.domain.property.PropertyAddress;
import com.onemount.service.business.domain.property.Sector;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import com.onemount.service.infrastructure.datasources.sql.PropertyAddressSql;
import com.onemount.service.infrastructure.datasources.sql.SectorsSql;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PropertyAddressSqlMapper extends IObjectMapper<PropertyAddress, PropertyAddressSql> {
}
