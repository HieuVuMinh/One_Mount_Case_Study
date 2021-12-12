package com.onemount.service.application.controllers.mapper.project;

import com.onemount.service.application.controllers.dto.project.ProjectGalleryDto;
import com.onemount.service.business.domain.project.ProjectGallery;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectGalleryDtoMapper extends IObjectMapper<ProjectGalleryDto, ProjectGallery> {

}
