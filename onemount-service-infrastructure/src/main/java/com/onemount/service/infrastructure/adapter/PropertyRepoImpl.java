package com.onemount.service.infrastructure.adapter;

import com.onemount.service.business.domain.property.Properties;
import com.onemount.service.business.domain.repo.PropertyRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class PropertyRepoImpl implements PropertyRepo {

    @Override
    public Page<Properties> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public Properties getById(String id) {
        return null;
    }

    @Override
    public Properties create(Properties properties) {
        return null;
    }
}
