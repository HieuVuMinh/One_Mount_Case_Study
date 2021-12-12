package com.onemount.service.application.controllers.mapper.user;

import com.onemount.service.application.controllers.dto.user.UserDto;
import com.onemount.service.business.domain.user.User;
import com.onemount.service.common.shared.mapper.IObjectMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoMapper extends IObjectMapper<UserDto, User> {

}
