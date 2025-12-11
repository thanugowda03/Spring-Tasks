package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VendorDTO {
    private int vendorId;
    private String vendorName;
    private int experience;
    private String type;
    private String email;
    private String password;
    private long contactNo;
    private String address;
}
