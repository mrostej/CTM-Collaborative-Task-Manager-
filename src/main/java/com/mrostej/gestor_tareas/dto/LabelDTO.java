package com.mrostej.gestor_tareas.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LabelDTO {

    private Long id;
    private String name;
    private String color;
    private List<Long> tasks;
    private Long board;

}
