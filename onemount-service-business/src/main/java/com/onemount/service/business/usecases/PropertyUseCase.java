package com.onemount.service.business.usecases;
import com.onemount.service.business.domain.property.Properties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PropertyUseCase {

    Page<Properties> getAll(Pageable pageable);

    Properties getById(String id);

}
