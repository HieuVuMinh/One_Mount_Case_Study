package com.onemount.service.application.controllers.mapper.property;

import com.onemount.service.application.controllers.dto.property.SectorDto;
import com.onemount.service.application.controllers.mapper.project.ProjectAddressDtoMapper;
import com.onemount.service.application.controllers.mapper.project.ProjectGalleryDtoMapper;
import com.onemount.service.business.domain.project.Project;
import com.onemount.service.business.domain.property.Properties;
import com.onemount.service.business.domain.property.Sector;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SectorDtoMapper extends IObjectMapper<SectorDto, Sector> {

}
