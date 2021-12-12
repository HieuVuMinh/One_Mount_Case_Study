package com.onemount.service.business.domain.role;

import com.onemount.service.common.shared.shared.AggregateRoot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role implements AggregateRoot<Role>{

    private String id;

    private String name;

    @Override
    public Role clone() {
        return null;
    }
}
