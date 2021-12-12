package com.onemount.service.infrastructure.datasources.sql.repo;

import com.onemount.service.infrastructure.datasources.sql.ProjectSql;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectSqlRepo extends PagingAndSortingRepository<ProjectSql, String> {

    List<ProjectSql> findAll();
}
