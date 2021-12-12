package com.onemount.service.infrastructure.service.user;

import com.onemount.service.infrastructure.datasources.sql.UserSql;
import com.onemount.service.infrastructure.datasources.sql.repo.UserSqlRepo;

import com.onemount.service.infrastructure.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserSqlRepo repo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Iterable<UserSql> findAll() {
        return repo.findAll();
    }

    @Override
    public Optional<UserSql> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public UserSql save(UserSql userSql) {
        userSql.setPassword(passwordEncoder.encode(userSql.getPassword()));
        return repo.save(userSql);
    }

    @Override
    public void deleteById(String id) {
        repo.deleteById(id);
    }

    @Override
    public Optional<UserSql> findByUsername(String username) {
        return repo.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserSql> userOptional = findByUsername(username);
        if (!userOptional.isPresent()) {
            throw new UsernameNotFoundException(username);
        }
        return UserDetailsImpl.build(userOptional.get());
    }
}
