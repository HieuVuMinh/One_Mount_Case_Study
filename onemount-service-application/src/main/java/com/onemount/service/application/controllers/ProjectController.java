package com.onemount.service.application.controllers;

import com.onemount.service.application.controllers.dto.project.ProjectDto;
import com.onemount.service.application.controllers.mapper.project.ProjectDtoMapper;
import com.onemount.service.business.usecases.ProjectUseCase;
import com.onemount.service.common.shared.infrastructure.rest.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;


@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping(value = {"/v1/projects"})
public class ProjectController {

    private final ProjectUseCase useCase;

    private final ProjectDtoMapper mapper;

    @GetMapping
    public Iterable<ProjectDto> getAll() {

       return useCase.getAll().stream().map(mapper::to).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public BaseResponse<ProjectDto> getAllProject(@PathVariable("id") String id) {
        return BaseResponse.ofSucceeded(mapper.to(useCase.getById(id)));
    }
}

