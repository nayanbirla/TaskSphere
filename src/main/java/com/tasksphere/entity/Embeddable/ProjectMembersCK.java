package com.tasksphere.entity.Embeddable;

import com.tasksphere.entity.Project;
import com.tasksphere.entity.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ProjectMembersCK {
    @ManyToOne
    Project projectId;

    @ManyToOne
    User userId;
}
