package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TrainerDTO {
    private int trainerId;
    private String trainerName;
    private int exp;
    private String specialization;
    private String email;
    private String password;
    private long phone;
    private String location;
}
