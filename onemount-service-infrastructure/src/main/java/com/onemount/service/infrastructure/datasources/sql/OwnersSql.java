package com.onemount.service.infrastructure.datasources.sql;

import com.onemount.service.infrastructure.config.BaseModel;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "OWNERS")
public class OwnersSql extends BaseModel {
    private long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    private List<PropertiesSql> properties;

    @ManyToMany
    @JoinTable(name = "PROPERTY_OWNER",
        joinColumns = @JoinColumn(name = "owner_id"),
        inverseJoinColumns = @JoinColumn(name = "property_id"))
    public List<PropertiesSql> getProperties() {
        return properties;
    }

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 200)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone_number", nullable = true, length = 200)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
