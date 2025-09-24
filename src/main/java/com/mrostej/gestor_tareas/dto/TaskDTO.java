package com.mrostej.gestor_tareas.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskDTO {

    private Long id;
    private String name;
    private String description;
    private Boolean completed;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long board;
    private List<Long> labels;

}
