package com.onemount.service.infrastructure.datasources.sql;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USERS")
public class UserSql {

    private String id;

    private String username;

    private String password;

    private String fullName;

    private String profilePicture;

    private String description;

    private RoleSql role;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    public RoleSql getRole() {
        return role;
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
    @Column(name = "user_name", nullable = true, length = 200)
    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 200)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "profile_picture", nullable = true, length = 200)
    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "full_name", nullable = true, length = 200)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
