package com.onemount.service.application.controllers;

import com.onemount.service.application.controllers.dto.project.ProjectDto;
import com.onemount.service.application.controllers.dto.property.PropertyDto;
import com.onemount.service.application.controllers.mapper.project.ProjectDtoMapper;
import com.onemount.service.application.controllers.mapper.property.PropertyDtoMapper;
import com.onemount.service.business.usecases.ProjectUseCase;
import com.onemount.service.business.usecases.PropertyUseCase;
import com.onemount.service.common.shared.infrastructure.rest.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping(value = {"/v1/properties"})
public class PropertyController {

    private final PropertyUseCase useCase;

    private final PropertyDtoMapper mapper;

    @GetMapping
    public BaseResponse<Page<PropertyDto>> getAll(Pageable pageable) {

        var resp = useCase.getAll(pageable);

        return BaseResponse.ofSucceeded(resp.map(mapper::to));
    }

    @GetMapping("/{id}")
    public BaseResponse<PropertyDto> getAllProject(@PathVariable("id") String id) {
        return BaseResponse.ofSucceeded(mapper.to(useCase.getById(id)));
    }
}

