package com.onemount.service.business.usecases;
import com.onemount.service.business.domain.user.User;

public interface UserUseCase {

    User getById(String id);

    User create(User user);
}
