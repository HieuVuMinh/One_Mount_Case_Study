package com.onemount.service.business.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Owner {

    private String ownerId;
    private String ownerName;
    private String phoneNumber;
    private String gender;
    private String source;
}
