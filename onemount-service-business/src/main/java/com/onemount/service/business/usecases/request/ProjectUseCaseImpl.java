package com.onemount.service.business.usecases.request;
import com.onemount.service.business.domain.project.Project;
import com.onemount.service.business.domain.repo.ProjectRepo;
import com.onemount.service.business.usecases.ProjectUseCase;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class ProjectUseCaseImpl implements ProjectUseCase {

  private ProjectRepo repo;

  @Override
  public List<Project> getAll() {
    return repo.getAll();
  }

  @Override
  public Project getById(String id) {
    return repo.getById(id);
  }

  @Override
  public Project create(Project project){
    return repo.create(project);
  }
}
