package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SellerDTO {
    private int sellerId;
    private String sellerName;
    private int rating;
    private String type;
    private String email;
    private String password;
    private long phone;
    private String city;
}
