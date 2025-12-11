package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class EmployeeDTO {

        private int employeeId;
        private String eName;
        private int age;
        private String gender;
        private String email;
        private String password;
        private long phoneNo;
        private String address;
    }
