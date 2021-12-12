package com.onemount.service.infrastructure.datasources.sql.mapper;

import com.onemount.service.business.domain.project.ProjectAddress;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import com.onemount.service.infrastructure.datasources.sql.ProjectAddressSql;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ProjectAddressSqlMapper extends IObjectMapper<ProjectAddress, ProjectAddressSql> {

}
