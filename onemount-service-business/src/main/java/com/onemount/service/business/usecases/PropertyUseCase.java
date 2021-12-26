package com.onemount.service.business.usecases;
import com.onemount.service.business.domain.property.Properties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PropertyUseCase {

    List<Properties> getAll();

    Properties getById(String id);

}
