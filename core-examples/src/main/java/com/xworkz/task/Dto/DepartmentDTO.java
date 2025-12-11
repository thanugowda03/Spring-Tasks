package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DepartmentDTO {
    private int departmentId;
    private String departmentName;
    private int strength;
    private String head;
    private String email;
    private String password;
    private long phone;
    private String location;
}
