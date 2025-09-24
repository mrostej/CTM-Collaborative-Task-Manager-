package com.mrostej.gestor_tareas.mapper;

import com.mrostej.gestor_tareas.dto.BoardDTO;
import com.mrostej.gestor_tareas.model.Board;
import com.mrostej.gestor_tareas.model.Label;
import com.mrostej.gestor_tareas.model.Task;
import com.mrostej.gestor_tareas.model.User;

public class BoardMapper {

    public static BoardDTO toDTO(Board board) {
        return BoardDTO.builder()
                .id(board.getId())
                .name(board.getName())
                .description(board.getDescription())
                .createdAt(board.getCreatedAt())
                .owner(board.getOwner().getId())
                .members(board.getMembers() != null
                        ? board.getMembers().stream().map(User::getId).toList()
                        : null)
                .tasks(board.getTasks() != null
                        ? board.getTasks().stream().map(Task::getId).toList()
                        : null)
                .labels(board.getLabels() != null
                        ? board.getLabels().stream().map(Label::getId).toList()
                        : null)
                .build();
    }

}
