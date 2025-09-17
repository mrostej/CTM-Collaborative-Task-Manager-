package com.mrostej.gestor_tareas.model;

import jakarta.persistence.*;
import lombok.*;

// The task the user create and modify

@Entity
@Table(name = "tasks")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Task {

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private String description;


    // List of objetives

    // progress bar automatically filled

    // List of users involved

    // Initial Date

    // Final Date

}
