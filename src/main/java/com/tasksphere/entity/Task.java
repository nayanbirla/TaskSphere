package com.tasksphere.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "projectId")
    Project projectId;

    @ManyToOne
    @JoinColumn(name = "createdBy")
    User createdBy;

    @Column(length = 100)
    String title;

    @Column(length = 1000)
    String description;

    @ManyToOne
    @JoinColumn(name = "assignedTo")
    User assignedTo;
}
