package com.onemount.service.business.usecases.request;

import com.onemount.service.business.domain.property.Properties;
import com.onemount.service.business.domain.repo.PropertyRepo;
import com.onemount.service.business.usecases.PropertyUseCase;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PropertyUseCaseImpl implements PropertyUseCase {

    private PropertyRepo repo;

    @Override
    public Page<Properties> getAll(Pageable pageable) {
        return repo.getAll(pageable);
    }

    @Override
    public Properties getById(String id) {
        return repo.getById(id);
    }
}
