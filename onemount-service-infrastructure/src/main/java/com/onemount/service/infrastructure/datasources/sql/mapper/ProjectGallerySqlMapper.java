package com.onemount.service.infrastructure.datasources.sql.mapper;

import com.onemount.service.business.domain.project.ProjectGallery;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import com.onemount.service.infrastructure.datasources.sql.ProjectGallerySql;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ProjectGallerySqlMapper extends IObjectMapper<ProjectGallery, ProjectGallerySql> {

}
