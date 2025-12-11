package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PatientDTO {
    private int patientId;
    private String patientName;
    private int age;
    private String gender;
    private String email;
    private String password;
    private long contactNo;
    private String address;
}
