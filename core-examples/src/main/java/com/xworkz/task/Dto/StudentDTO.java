package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDTO {
    private int studentId;
    private String studentName;
    private int age;
    private String gender;
    private String email;
    private String password;
    private long mobile;
    private String city;
}

