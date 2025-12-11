package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HotelDTO {
    private int hotelId;
    private String hotelName;
    private int rooms;
    private String type;
    private String email;
    private String password;
    private long contact;
    private String location;
}
