package com.mrostej.gestor_tareas.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

// The data from the users the program send to the frontend

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {

    private Long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private LocalDateTime createdAt;
    private byte[] profileImage;
    private List<Long> ownedBoardIds;
    private List<Long> memberBoardIds;

}
