package com.onemount.service.application.controllers.mapper.property;

import com.onemount.service.application.controllers.dto.property.PropertyGalleryDto;
import com.onemount.service.business.domain.property.PropertyGallery;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PropertyGalleryDtoMapper extends IObjectMapper<PropertyGalleryDto, PropertyGallery> {
}
