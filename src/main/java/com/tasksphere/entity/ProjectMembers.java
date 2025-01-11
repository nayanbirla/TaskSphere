package com.tasksphere.entity;

import com.tasksphere.entity.Embeddable.ProjectMembersCK;
import jakarta.persistence.*;

@Entity
public class ProjectMembers {

    @EmbeddedId
    ProjectMembersCK projectMembersCK;

    // Permission will be defined later
}
