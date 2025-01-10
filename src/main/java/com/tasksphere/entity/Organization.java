package com.tasksphere.entity;

import jakarta.persistence.*;

@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(length = 50)
    String name;

    @Column(length = 500)
    String about;

    @Column(length = 200)
    String location;

    @OneToMany
    User createdBy;
}
