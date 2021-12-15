package com.onemount.service.application.controllers.mapper.property;

import com.onemount.service.application.controllers.dto.property.PropertyDto;
import com.onemount.service.business.domain.property.Properties;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        PropertyAddressDtoMapper.class,
        PropertyGalleryDtoMapper.class,
        SectorDtoMapper.class
})
public interface PropertyDtoMapper extends IObjectMapper<PropertyDto, Properties> {

}
