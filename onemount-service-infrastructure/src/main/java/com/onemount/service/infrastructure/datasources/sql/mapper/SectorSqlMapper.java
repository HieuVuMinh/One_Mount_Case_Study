package com.onemount.service.infrastructure.datasources.sql.mapper;

import com.onemount.service.business.domain.property.Sector;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import com.onemount.service.infrastructure.datasources.sql.SectorsSql;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SectorSqlMapper extends IObjectMapper<Sector, SectorsSql> {
}
