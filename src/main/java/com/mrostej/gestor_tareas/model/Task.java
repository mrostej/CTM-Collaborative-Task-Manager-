package com.mrostej.gestor_tareas.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

// The task the user create and modify

@Entity
@Table(name = "tasks")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Task {

    // --- VARIABLES ---

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDateTime startDate;

    @Column(nullable = false)
    private LocalDateTime endDate;

    // --- RELATIONS ---

    // task's board
    @ManyToOne(optional = false)
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    // task's labels
    @ManyToMany
    @JoinTable(
            name = "task_labels",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "label_id")
    )
    private List<Label> labels;

}
