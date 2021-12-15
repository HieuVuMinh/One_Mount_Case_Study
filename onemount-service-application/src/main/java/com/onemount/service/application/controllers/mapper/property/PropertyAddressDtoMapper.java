package com.onemount.service.application.controllers.mapper.property;

import com.onemount.service.application.controllers.dto.property.PropertyAddressDto;
import com.onemount.service.business.domain.property.PropertyAddress;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PropertyAddressDtoMapper extends IObjectMapper<PropertyAddressDto, PropertyAddress> {
}
