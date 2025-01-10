package com.tasksphere.entity;

import jakarta.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String title;

    String description;

    String image;

    @OneToMany
    Organization organizationId;

    @OneToMany
    User createdBy;
}
