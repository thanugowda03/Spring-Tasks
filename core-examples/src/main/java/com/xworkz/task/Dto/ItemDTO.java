package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemDTO {
    private int itemId;
    private String itemName;
    private int quantity;
    private String type;
    private String email;
    private String password;
    private long phone;
    private String address;
}
