package com.onemount.service.infrastructure.security;

import com.onemount.service.infrastructure.datasources.sql.UserSql;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails {
    private String id;

    private String username;

    private String password;

    private String fullName;

    private String profilePicture;

    private String description;

    private Collection<? extends GrantedAuthority> roles;

    public UserDetailsImpl(String id, String username, String password, String fullName, String profilePicture, String description, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.profilePicture = profilePicture;
        this.description = description;
        this.roles = roles;
    }

    public static UserDetailsImpl build(UserSql user) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(user.getRole().getName()));
        return new UserDetailsImpl(user.getId(), user.getUsername(), user.getPassword(), user.getFullName(), user.getProfilePicture(), user.getDescription(), authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
