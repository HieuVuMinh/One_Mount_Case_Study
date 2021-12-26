package com.onemount.service.business.domain.repo;

import com.onemount.service.business.domain.property.Properties;

import java.util.List;

public interface PropertyRepo {

    List<Properties> getAll();

    Properties getById(String id);

}
