package com.tasksphere.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(length = 30)
    String firstName;

    @Column(length = 30)
    String lastName;

    @Column(length = 30)
    String email;

    @Column(length = 30)
    String password;
}
