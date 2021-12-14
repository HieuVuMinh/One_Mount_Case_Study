package com.onemount.service.business.domain.repo;

import com.onemount.service.business.domain.user.User;

public interface UserRepo {

    User getById(String id);

    User create(User user);
}
