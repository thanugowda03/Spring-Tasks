package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodDTO {
    private int foodId;
    private String foodName;
    private int quantity;
    private String category;
    private String email;
    private String password;
    private long contact;
    private String location;
}
