package com.onemount.service.infrastructure.adapter;

import com.onemount.service.business.domain.project.Project;
import com.onemount.service.business.domain.repo.ProjectRepo;
import com.onemount.service.infrastructure.datasources.sql.mapper.ProjectSqlMapper;
import com.onemount.service.infrastructure.datasources.sql.repo.ProjectSqlRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Slf4j
@Component
@AllArgsConstructor
@Transactional
public class ProjectRepoImpl implements ProjectRepo {

    private final ProjectSqlRepo repo;

    private final ProjectSqlMapper mapper;

    @Override
    public Page<Project> getAll(Pageable pageable) {
        return repo.findAll(pageable).map(mapper::to);
    }

    @Override
    public Project getById(String id) {
        return mapper.to(repo.findById(id).get());
    }

    @Override
    public Project create(Project project) {
        return null;
    }
}
