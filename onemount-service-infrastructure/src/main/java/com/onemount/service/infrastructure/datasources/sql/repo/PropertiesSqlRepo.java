package com.onemount.service.infrastructure.datasources.sql.repo;

import com.onemount.service.infrastructure.datasources.sql.PropertiesSql;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertiesSqlRepo extends PagingAndSortingRepository<PropertiesSql, String> {

    List<PropertiesSql> findAll();

    @Query(value = "", nativeQuery = true)
    List<PropertiesSql> findByProjectIdAndTotalPrice(String projectId, double price);
}
