package com.tasksphere.entity.Embeddable;

import com.tasksphere.entity.Organization;
import com.tasksphere.entity.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class UserOrganizationCK {
    @ManyToOne
    @JoinColumn(name = "organizationId")
    Organization organizationId;

    @ManyToOne
    @JoinColumn(name = "userId")
    User userId;
}
