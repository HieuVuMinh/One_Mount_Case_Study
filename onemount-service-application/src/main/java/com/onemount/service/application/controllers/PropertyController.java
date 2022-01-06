package com.onemount.service.application.controllers;

import com.onemount.service.application.controllers.dto.property.PropertyDto;
import com.onemount.service.application.controllers.mapper.property.PropertyDtoMapper;
import com.onemount.service.business.domain.property.Properties;
import com.onemount.service.business.usecases.PropertyUseCase;
import com.onemount.service.common.shared.infrastructure.rest.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Slf4j
@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping(value = {"/v1/properties"})
public class PropertyController {

    private final PropertyUseCase useCase;

    private final PropertyDtoMapper mapper;

    @GetMapping
    public Iterable<PropertyDto> getAll() {
        return useCase.getAll().stream().map(mapper::to).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public BaseResponse<PropertyDto> getAllProject(@PathVariable("id") String id) {
        return BaseResponse.ofSucceeded(mapper.to(useCase.getById(id)));
    }
}

