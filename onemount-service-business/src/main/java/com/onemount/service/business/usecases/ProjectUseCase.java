package com.onemount.service.business.usecases;
import com.onemount.service.business.domain.project.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectUseCase {

    List<Project> getAll();

    Project getById(String id);

    Project create(Project project);
}
