package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TrainerRecordDTO {
    private int recordId;
    private String trainerName;
    private int exp;
    private String subject;
    private String email;
    private String password;
    private long contact;
    private String center;
}
