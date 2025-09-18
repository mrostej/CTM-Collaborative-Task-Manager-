package com.mrostej.gestor_tareas.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

// The labels the users will be able to put on their tasks

@Entity
@Table(name = "labels")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Label {

    // --- VARIABLES ---

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 7) // HEX color (#RRGGBB)
    private String color;

    // --- RELATIONS ---

    // Tasks assigned to the label
    @ManyToMany(mappedBy = "labels")
    private List<Task> tasks;

}
