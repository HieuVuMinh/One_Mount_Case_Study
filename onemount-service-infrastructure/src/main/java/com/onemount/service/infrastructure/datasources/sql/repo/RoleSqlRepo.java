package com.onemount.service.infrastructure.datasources.sql.repo;

import com.onemount.service.infrastructure.datasources.sql.RoleSql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleSqlRepo extends JpaRepository<RoleSql, String> {
    RoleSql findByName(String name);

}
