package com.mrostej.gestor_tareas.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

// The user of the APP, with his different tasks, friends and more.

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class User {

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 75)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = true, unique = true, length = 15)
    private Number phone;

    @Column(nullable = false, unique = true, length = 6)
    private String userCode;

    @Column(nullable = false)
    private Date CreationDate;

    @Column(nullable = false)
    private String password;

    // Add img for the users

    // Add the tasks list

    // Add the friends list

}
