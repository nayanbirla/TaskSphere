package com.tasksphere.entity.Embeddable;

import com.tasksphere.entity.Organization;
import com.tasksphere.entity.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

@Embeddable
public class UserOrganizationCK {
    @ManyToOne
    Organization organizationId;

    @ManyToOne
    User userId;
}
