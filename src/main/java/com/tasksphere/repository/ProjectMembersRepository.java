package com.tasksphere.repository;

import com.tasksphere.entity.ProjectMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectMembersRepository extends JpaRepository<ProjectMembers,Integer> {
}
