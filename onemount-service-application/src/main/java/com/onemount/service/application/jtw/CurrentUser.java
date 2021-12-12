package com.onemount.service.application.jtw;

import com.onemount.service.infrastructure.datasources.sql.UserSql;
import com.onemount.service.infrastructure.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class CurrentUser {
    @Autowired
    private static UserService userService;

    public static UserSql get() {
        Object loginUser = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserSql user = null;
        if (loginUser instanceof UserDetails) {
            String loginUsername = ((UserDetails) loginUser).getUsername();
            user = userService.findByUsername(loginUsername).get();
        }
        return user;
    }
}
