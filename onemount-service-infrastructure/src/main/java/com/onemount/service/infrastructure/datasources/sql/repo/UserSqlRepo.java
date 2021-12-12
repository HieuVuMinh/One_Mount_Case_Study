package com.onemount.service.infrastructure.datasources.sql.repo;

import com.onemount.service.infrastructure.datasources.sql.UserSql;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserSqlRepo extends JpaRepository<UserSql, String> {

    Optional<UserSql> findByUsername(String username);

}
