package com.tasksphere.entity;

import com.tasksphere.entity.Types.Status;
import jakarta.persistence.*;

public class SubTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    Task taskId;

    @Column(length = 100)
    String title;

    @Column(length = 1000)
    String description;

    @ManyToOne
    User createdBy;

    @ManyToOne
    User assignedTo;

    Status status;
}
