package com.onemount.service.infrastructure.datasources.sql.repo;

import com.onemount.service.infrastructure.datasources.sql.PropertiesSql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertiesSqlRepo extends JpaRepository<PropertiesSql, String> {

    List<PropertiesSql> findAll();

//    @Query(value = "", nativeQuery = true)
//    List<PropertiesSql> findByProjectIdAndTotalPrice(String projectId, double price);
}
