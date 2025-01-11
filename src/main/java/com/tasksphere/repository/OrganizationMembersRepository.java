package com.tasksphere.repository;

import com.tasksphere.entity.OrganizationMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationMembersRepository extends JpaRepository<OrganizationMembers,Integer> {
}
