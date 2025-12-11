package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LibraryDTO {
    private int libraryId;
    private String libraryName;
    private int books;
    private String category;
    private String email;
    private String password;
    private long phone;
    private String address;
}
