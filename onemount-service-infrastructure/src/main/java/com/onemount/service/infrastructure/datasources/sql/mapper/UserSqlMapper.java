package com.onemount.service.infrastructure.datasources.sql.mapper;

import com.onemount.service.business.domain.user.User;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import com.onemount.service.infrastructure.datasources.sql.UserSql;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserSqlMapper extends IObjectMapper<User, UserSql> {

}
