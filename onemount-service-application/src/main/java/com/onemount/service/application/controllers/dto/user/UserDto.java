package com.onemount.service.application.controllers.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String id;

    private String username;

    private String password;

    private String fullName;

    private String profilePicture;

    private String description;
}
