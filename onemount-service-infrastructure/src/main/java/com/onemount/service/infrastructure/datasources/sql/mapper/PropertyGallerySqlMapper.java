package com.onemount.service.infrastructure.datasources.sql.mapper;

import com.onemount.service.business.domain.property.PropertyGallery;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import com.onemount.service.infrastructure.datasources.sql.PropertyGalleriesSql;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PropertyGallerySqlMapper extends IObjectMapper<PropertyGallery, PropertyGalleriesSql> {
}
