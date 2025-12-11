package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseDTO {
    private int courseId;
    private String courseName;
    private int duration;
    private String level;
    private String email;
    private String password;
    private long contact;
    private String center;
}
