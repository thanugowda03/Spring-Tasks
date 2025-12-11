package com.xworkz.task.Dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CompanyDTO {
    private int companyId;
    private String companyName;
    private int strength;
    private String category;
    private String email;
    private String password;
    private long phone;
    private String location;
}
