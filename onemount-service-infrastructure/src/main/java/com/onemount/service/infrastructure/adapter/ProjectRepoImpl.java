package com.onemount.service.infrastructure.adapter;

import com.onemount.service.business.domain.project.Project;
import com.onemount.service.business.domain.repo.ProjectRepo;
import com.onemount.service.infrastructure.datasources.sql.ProjectSql;
import com.onemount.service.infrastructure.datasources.sql.mapper.ProjectSqlMapper;
import com.onemount.service.infrastructure.datasources.sql.repo.ProjectSqlRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Component
@AllArgsConstructor
@Transactional
public class ProjectRepoImpl implements ProjectRepo {

    private final ProjectSqlRepo repo;

    private final ProjectSqlMapper mapper;

    @Override
    public List<Project> getAll() {
        return repo.findAll().stream().map(mapper::to).collect(Collectors.toList());
    }

    @Override
    public Project getById(String id) {

        Optional<ProjectSql> projectSql = repo.findById(id);
        return mapper.to(projectSql.get());
    }

    @Override
    public Project create(Project project) {
        return null;
    }
}
