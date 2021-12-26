package com.onemount.service.application.jtw;

import com.onemount.service.infrastructure.datasources.sql.RoleSql;
import com.onemount.service.infrastructure.datasources.sql.UserSql;
import com.onemount.service.infrastructure.service.role.RoleService;
import com.onemount.service.infrastructure.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public JwtAuthenticationFilter jwtAuthenticationFilter() {
        return new JwtAuthenticationFilter();
    }

    @Bean(BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @PostConstruct
    public void init() {
        List<UserSql> userSqlList = (List<UserSql>) userService.findAll();
        List<RoleSql> roleSqlList = (List<RoleSql>) roleService.findAll();
        if (roleSqlList.isEmpty()) {
            //Role admin
            RoleSql roleAdmin = createRole_Admin();
            roleService.save(roleAdmin);

            //Role user
            createRole_User(roleAdmin);
            roleService.save(roleAdmin);
        }
        if (userSqlList.isEmpty()) {
            UserSql admin = new UserSql();
            RoleSql roleAdmin = createRole_Admin();

            admin.setId(UUID.randomUUID().toString());
            admin.setUsername("admin");
            admin.setPassword("1");
            admin.setFullName("Admin");
            admin.setRole(roleAdmin);
            userService.save(admin);
        }
    }

    private void createRole_User(RoleSql roleAdmin) {
        RoleSql roleUser = new RoleSql();
        roleAdmin.setId("2");
        roleAdmin.setName("ROLE_USER");
    }

    private RoleSql createRole_Admin() {
        RoleSql roleAdmin = new RoleSql();
        roleAdmin.setId("1");
        roleAdmin.setName("ROLE_ADMIN");
        return roleAdmin;
    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.cors();
        http.authorizeRequests()
                .antMatchers("/**").permitAll();
//                .anyRequest().authenticated();
//        http.authorizeRequests()
//                .antMatchers("/","/wall/**").permitAll()
//                .antMatchers("/users/{userId}/**").access("hasRole('ADMIN') or @userSecurity.hasUserId(authentication,#userId)");
    }

//    public boolean hasUserId(Authentication authentication, Long userId) {
//        User user = userService.findById(userId).get();
//        if (((UserDetails) authentication.getDetails()).getUsername().equals(user.getUsername())) {
//            return true;
//        }
//        return false;
//    }
}
