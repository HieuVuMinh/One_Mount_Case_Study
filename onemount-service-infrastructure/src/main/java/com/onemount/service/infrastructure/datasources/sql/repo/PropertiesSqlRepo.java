package com.onemount.service.infrastructure.datasources.sql.repo;

import com.onemount.service.infrastructure.datasources.sql.PropertiesSql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertiesSqlRepo extends JpaRepository<PropertiesSql, String> {

    List<PropertiesSql> findAll();

    @Query("select pr from PropertiesSql pr join ProjectSql pj on pj.projectId = pr.project.projectId " +
            "where pr.projectName = ?1 " +
            "and pr.totalPrice between 0 and ?2")
    List<PropertiesSql> findByProjectNameAndTotalPrice(String projectName, double price);
}
