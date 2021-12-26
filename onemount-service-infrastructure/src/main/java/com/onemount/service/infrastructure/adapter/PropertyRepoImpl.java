package com.onemount.service.infrastructure.adapter;

import com.onemount.service.business.domain.property.Properties;
import com.onemount.service.business.domain.repo.PropertyRepo;
import com.onemount.service.infrastructure.datasources.sql.PropertiesSql;
import com.onemount.service.infrastructure.datasources.sql.mapper.PropertiesSqlMapper;
import com.onemount.service.infrastructure.datasources.sql.repo.PropertiesSqlRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Component
@AllArgsConstructor
public class PropertyRepoImpl implements PropertyRepo {

    private final PropertiesSqlRepo repo;

    private final PropertiesSqlMapper mapper;

    @Override
    public List<Properties> getAll() {
        return repo.findAll().stream().map(mapper::to).collect(Collectors.toList());
    }

    @Override
    public Properties getById(String id) {
        return mapper.to(repo.findById(id).get());
    }

}
