package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VehicleDTO {
    private int vehicleId;
    private String vehicleName;
    private int model;
    private String type;
    private String email;
    private String password;
    private long contactNo;
    private String location;
}
