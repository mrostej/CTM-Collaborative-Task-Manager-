package com.mrostej.gestor_tareas.mapper;

import com.mrostej.gestor_tareas.dto.UserDTO;
import com.mrostej.gestor_tareas.model.Board;
import com.mrostej.gestor_tareas.model.User;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .username(user.getUsername())
                .email(user.getEmail())
                .phone(user.getPhone())
                .createdAt(user.getCreatedAt())
                .profileImage(user.getProfileImage())
                .ownedBoardIds(user.getOwnedBoards() != null
                        ? user.getOwnedBoards().stream().map(Board::getId).toList()
                        : null)
                .memberBoardIds(user.getMemberBoards() != null
                        ? user.getMemberBoards().stream().map(Board::getId).toList()
                        : null)
                .build();
    }

}
