package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ShopDTO {
    private int shopId;
    private String shopName;
    private int employees;
    private String category;
    private String email;
    private String password;
    private long phone;
    private String address;
}
