package com.onemount.service.business.usecases;
import com.onemount.service.business.domain.project.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProjectUseCase {

    Page<Project> getAll(Pageable pageable);

    Project getById(String id);

    Project create(Project project);
}
