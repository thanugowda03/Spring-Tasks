package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoomDTO {
    private int roomId;
    private String roomName;
    private int capacity;
    private String type;
    private String email;
    private String password;
    private long phone;
    private String block;
}
