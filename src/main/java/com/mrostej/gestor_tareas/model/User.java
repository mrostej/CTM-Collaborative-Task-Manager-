package com.mrostej.gestor_tareas.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

// The user of the APP, with his different tasks, friends and more.

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class User {

    // --- VARIABLES ---

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 75)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = true, unique = true, length = 15)
    private String phone;

    // 6-digit code to identify the user
    @Column(nullable = false, unique = true, length = 6)
    private String userCode;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false, length = 255)
    private String password;

    @Lob
    @Column(name = "profile_image", columnDefinition = "LONGBLOB")
    private byte[] profileImage;

    // TODO in 1.1
    // fast task list

    // TODO in 1.1
    // friends list

    // --- RELATIONS ---

    // Boards where the user is the owner
    @OneToMany(mappedBy = "owner")
    private List<Board> ownedBoards;

    // Boards where the user is a member
    @ManyToMany(mappedBy = "members")
    private List<Board> memberBoards;

}
