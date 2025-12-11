package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountDTO {
    private int accountId;
    private String accountName;
    private int age;
    private String type;
    private String email;
    private String password;
    private long phone;
    private String city;
}
