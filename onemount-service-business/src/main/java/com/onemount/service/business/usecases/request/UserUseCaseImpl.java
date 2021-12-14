package com.onemount.service.business.usecases.request;

import com.onemount.service.business.domain.repo.UserRepo;
import com.onemount.service.business.domain.user.User;
import com.onemount.service.business.usecases.UserUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserUseCaseImpl implements UserUseCase {

    private UserRepo repo;

    @Override
    public User getById(String id) {
        return repo.getById(id);
    }

    @Override
    public User create(User user) {
        return repo.create(user);
    }
}
