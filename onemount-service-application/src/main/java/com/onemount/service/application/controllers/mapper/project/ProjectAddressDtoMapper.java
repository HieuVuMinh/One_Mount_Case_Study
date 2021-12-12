package com.onemount.service.application.controllers.mapper.project;


import com.onemount.service.application.controllers.dto.project.ProjectAddressDto;
import com.onemount.service.business.domain.project.ProjectAddress;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectAddressDtoMapper extends IObjectMapper<ProjectAddressDto, ProjectAddress> {

}
