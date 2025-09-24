package com.mrostej.gestor_tareas.mapper;

import com.mrostej.gestor_tareas.dto.LabelDTO;
import com.mrostej.gestor_tareas.model.Label;
import com.mrostej.gestor_tareas.model.Task;

public class LabelMapper {

    public static LabelDTO toDTO(Label label) {
        return LabelDTO.builder()
                .id(label.getId())
                .name(label.getName())
                .color(label.getColor())
                .tasks(label.getTasks() != null
                        ? label.getTasks().stream().map(Task::getId).toList()
                        : null)
                .board(label.getBoard().getId())
                .build();
    }

}
