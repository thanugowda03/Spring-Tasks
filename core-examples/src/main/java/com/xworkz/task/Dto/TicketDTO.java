package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TicketDTO {
    private int ticketId;
    private String ticketName;
    private int amount;
    private String type;
    private String email;
    private String password;
    private long phone;
    private String counter;
}
