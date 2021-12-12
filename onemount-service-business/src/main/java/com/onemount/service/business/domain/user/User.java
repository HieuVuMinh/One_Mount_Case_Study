package com.onemount.service.business.domain.user;

import com.onemount.service.common.shared.shared.AggregateRoot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements AggregateRoot<User> {

    private String id;

    private String username;

    private String password;

    private String fullName;

    private String profilePicture;

    private String description;

    @Override
    public User clone() {
        return null;
    }
}
