package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeliveryDTO {
    private int deliveryId;
    private String deliveryName;
    private int speed;
    private String vehicle;
    private String email;
    private String password;
    private long contactNo;
    private String route;
}
