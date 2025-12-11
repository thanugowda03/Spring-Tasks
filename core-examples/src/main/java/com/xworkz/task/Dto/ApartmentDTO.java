package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApartmentDTO {
    private int apartmentId;
    private String apartmentName;
    private int floors;
    private String type;
    private String email;
    private String password;
    private long phone;
    private String location;
}
