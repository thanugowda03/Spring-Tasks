package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminDTO {
    private int adminId;
    private String adminName;
    private int age;
    private String role;
    private String email;
    private String password;
    private long mobile;
    private String address;
}
