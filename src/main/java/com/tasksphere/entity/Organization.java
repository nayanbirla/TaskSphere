package com.tasksphere.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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

    @Column(length = 300)
    String image;

    Date createdDate;

    Date updatedDate;

    @OneToMany(mappedBy = "organizationId",cascade = CascadeType.ALL)
    List<Project> projects;

    @ManyToOne
    @JoinColumn(name = "createdByUser")
    User createdBy;
}
