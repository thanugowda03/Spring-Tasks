package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {
    private int customerId;
    private String customerName;
    private int age;
    private String gender;
    private String email;
    private String password;
    private long mobile;
    private String city;
}

