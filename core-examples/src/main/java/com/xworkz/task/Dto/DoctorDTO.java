package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DoctorDTO {
    private int doctorId;
    private String doctorName;
    private int experience;
    private String specialization;
    private String email;
    private String password;
    private long phoneNo;
    private String hospital;
}
