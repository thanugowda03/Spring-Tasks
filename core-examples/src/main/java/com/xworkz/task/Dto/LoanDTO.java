package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LoanDTO {
    private int loanId;
    private String loanName;
    private int amount;
    private String type;
    private String email;
    private String password;
    private long phone;
    private String branch;
}
