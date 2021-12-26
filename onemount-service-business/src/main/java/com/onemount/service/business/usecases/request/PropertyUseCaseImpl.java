package com.onemount.service.business.usecases.request;

import com.onemount.service.business.domain.property.Properties;
import com.onemount.service.business.domain.repo.PropertyRepo;
import com.onemount.service.business.usecases.PropertyUseCase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PropertyUseCaseImpl implements PropertyUseCase {

    private PropertyRepo repo;

    @Override
    public List<Properties> getAll() {
        return repo.getAll();
    }

    @Override
    public Properties getById(String id) {
        return repo.getById(id);
    }
}
