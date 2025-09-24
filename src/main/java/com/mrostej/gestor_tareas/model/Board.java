package com.mrostej.gestor_tareas.model;

// The boards where the user creates the tasks and modify them

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "boards")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Board {

    // --- VARIABLES ---

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 75)
    private String name;

    @Column(length = 255)
    private String description;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    // TODO in 1.1
    // progress bar automatically filled by completed tasks

    // --- RELATIONS ---

    // Owner of the board
    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;

    // Members of the board
    @ManyToMany
    @JoinTable(name = "board_users", joinColumns = @JoinColumn(name = "board_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> members;

    // Board's tasks
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> tasks = new ArrayList<>();

    // Board's labels
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Label> labels = new ArrayList<>();

}
