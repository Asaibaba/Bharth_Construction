// ProjectRepository.java
package com.bharat.repository;

import com.bharat.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
