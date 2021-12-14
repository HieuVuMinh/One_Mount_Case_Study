package com.onemount.service.infrastructure.adapter;

import com.onemount.service.business.domain.repo.UserRepo;
import com.onemount.service.business.domain.user.User;
import com.onemount.service.infrastructure.datasources.sql.RoleSql;
import com.onemount.service.infrastructure.datasources.sql.UserSql;
import com.onemount.service.infrastructure.datasources.sql.mapper.UserMapper;
import com.onemount.service.infrastructure.datasources.sql.mapper.UserSqlMapper;
import com.onemount.service.infrastructure.datasources.sql.repo.RoleSqlRepo;
import com.onemount.service.infrastructure.datasources.sql.repo.UserSqlRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.UUID;

@Slf4j
@Component
@AllArgsConstructor
@Transactional
public class UserRepoImpl implements UserRepo {

    private final UserSqlRepo repoUser;

    private final RoleSqlRepo repoRole;

    private final UserMapper mapperSql;

    private final UserSqlMapper mapper;

    private PasswordEncoder passwordEncoder;

    @Override
    public User getById(String id) {
        return mapper.to(repoUser.getById(id));
    }

    @Override
    public User create(User user) {
        UserSql userSql = mapperSql.to(user);
        userSql.setId(UUID.randomUUID().toString());
        userSql.setPassword(passwordEncoder.encode(user.getPassword()));
        userSql.setRole(createNewRoleUser());
        return mapper.to(repoUser.save(userSql));
    }

    private RoleSql createNewRoleUser() {
        RoleSql roleUser = new RoleSql();
        roleUser.setId("2");
        roleUser.setName("ROLE_USER");
        return roleUser;
    }
}
