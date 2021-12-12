package com.onemount.service.infrastructure.datasources.sql.mapper;

import com.onemount.service.business.domain.project.Project;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import com.onemount.service.infrastructure.datasources.sql.ProjectSql;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = {ProjectAddressSqlMapper.class, ProjectGallerySqlMapper.class})
public interface ProjectSqlMapper extends IObjectMapper<Project, ProjectSql> {

}
