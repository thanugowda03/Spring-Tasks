package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RestaurantDTO {
    private int restaurantId;
    private String restaurantName;
    private int capacity;
    private String type;
    private String email;
    private String password;
    private long phone;
    private String location;
}
