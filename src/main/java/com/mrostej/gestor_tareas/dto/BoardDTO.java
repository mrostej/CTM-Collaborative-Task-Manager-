package com.mrostej.gestor_tareas.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDTO {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Long owner;
    private List<Long> members;
    private List<Long> tasks = new ArrayList<>();
    private List<Long> labels = new ArrayList<>();

}