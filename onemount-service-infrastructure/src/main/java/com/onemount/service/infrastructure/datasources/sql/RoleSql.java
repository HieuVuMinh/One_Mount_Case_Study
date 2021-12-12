package com.onemount.service.infrastructure.datasources.sql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "ROLES")
@AllArgsConstructor
@NoArgsConstructor
public class RoleSql {

    private String id;

    private String name;

    private List<UserSql> users;

    @OneToMany(mappedBy = "role")
    public List<UserSql> getUsers() {
        return users;
    }

    @Id
    @Column(name = "id", nullable = false, length = 200)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role_name", nullable = false, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
