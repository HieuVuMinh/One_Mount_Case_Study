package com.onemount.service.application.controllers.mapper.project;

import com.onemount.service.application.controllers.dto.project.ProjectDto;
import com.onemount.service.business.domain.project.Project;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {
        ProjectAddressDtoMapper.class,
        ProjectGalleryDtoMapper.class
})
public interface ProjectDtoMapper extends IObjectMapper<ProjectDto, Project> {

}
