package com.onemount.service.application.controllers;

import com.onemount.service.application.controllers.dto.user.UserDto;
import com.onemount.service.application.controllers.mapper.user.UserDtoMapper;
import com.onemount.service.business.domain.user.User;
import com.onemount.service.business.usecases.UserUseCase;
import com.onemount.service.common.shared.infrastructure.rest.BaseResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = {"/v1/users"})
public class UserController {

    private final UserUseCase useCase;

    private final UserDtoMapper mapperDto;

    @PostMapping
    private BaseResponse<UserDto> save(@RequestBody UserDto userDto){
        User user = useCase.create(mapperDto.from(userDto));
        return BaseResponse.ofSucceeded(mapperDto.to(user));
    }

}
