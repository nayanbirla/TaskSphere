package com.tasksphere.entity;

import com.tasksphere.entity.Embeddable.UserOrganizationCK;
import jakarta.persistence.*;

@Entity
public class OrganizationMembers {

    @EmbeddedId
    UserOrganizationCK userOrganizationCK;

    // permission will be defined later
}
