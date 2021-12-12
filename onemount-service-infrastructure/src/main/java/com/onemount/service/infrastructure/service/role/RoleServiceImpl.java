package com.onemount.service.infrastructure.service.role;

import com.onemount.service.infrastructure.datasources.sql.RoleSql;
import com.onemount.service.infrastructure.datasources.sql.repo.RoleSqlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleSqlRepo repo;


    @Override
    public Iterable<RoleSql> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<RoleSql> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public RoleSql save(RoleSql roleSql) {
        return repo.save(roleSql);
    }

    @Override
    public void deleteById(String id) {
repo.deleteById(id);
    }

    @Override
    public RoleSql findByName(String name) {
        return repo.findByName(name);
    }
}
