package com.onemount.service.business.domain.repo;

import com.onemount.service.business.domain.property.Properties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PropertyRepo {

    Page<Properties> getAll(Pageable pageable);

    Properties getById(String id);

    Properties create(Properties properties);

}
