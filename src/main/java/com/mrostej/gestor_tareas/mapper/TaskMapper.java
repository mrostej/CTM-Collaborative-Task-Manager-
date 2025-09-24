package com.mrostej.gestor_tareas.mapper;

import com.mrostej.gestor_tareas.dto.TaskDTO;
import com.mrostej.gestor_tareas.model.Label;
import com.mrostej.gestor_tareas.model.Task;

public class TaskMapper {

    public static TaskDTO toDTO(Task task) {
        return TaskDTO.builder()
                .id(task.getId())
                .name(task.getName())
                .description(task.getDescription())
                .completed(task.getCompleted())
                .startDate(task.getStartDate())
                .endDate(task.getEndDate())
                .board(task.getBoard().getId())
                .labels(task.getLabels() != null
                        ? task.getLabels().stream().map(Label::getId).toList()
                        : null)
                .build();
    }

}
