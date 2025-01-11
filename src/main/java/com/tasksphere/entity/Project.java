package com.tasksphere.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(length = 100)
    String title;

    @Column(length = 500)
    String description;

    @Column(length = 300)
    String image;

    @ManyToOne
    @JoinColumn(name = "organizationId")
    Organization organizationId;

    @ManyToOne
    @JoinColumn(name = "createdBy")
    User createdBy;
}
