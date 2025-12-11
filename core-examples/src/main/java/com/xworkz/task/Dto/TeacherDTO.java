package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TeacherDTO {
    private int teacherId;
    private String teacherName;
    private int age;
    private String gender;
    private String email;
    private String password;
    private long phoneNo;
    private String subject;
}
