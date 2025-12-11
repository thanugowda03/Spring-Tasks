package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ManagerDTO {

        private int managerId;
        private String managerName;
        private int age;
        private String gender;
        private String email;
        private String password;
        private long phone;
        private String department;
    }


