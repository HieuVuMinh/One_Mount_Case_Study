package com.onemount.service.infrastructure.service.role;

import com.onemount.service.infrastructure.datasources.sql.GeneralUseCase;
import com.onemount.service.infrastructure.datasources.sql.RoleSql;

public interface RoleService extends GeneralUseCase<RoleSql> {
    RoleSql findByName(String name);
}
