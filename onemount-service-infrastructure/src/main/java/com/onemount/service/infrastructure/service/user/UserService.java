package com.onemount.service.infrastructure.service.user;

import com.onemount.service.infrastructure.datasources.sql.GeneralUseCase;
import com.onemount.service.infrastructure.datasources.sql.UserSql;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends GeneralUseCase<UserSql>, UserDetailsService {

    Optional<UserSql> findByUsername(String username);

}
