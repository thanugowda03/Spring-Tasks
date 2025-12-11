package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthorDTO {
    private int authorId;
    private String authorName;
    private int age;
    private String genre;
    private String email;
    private String password;
    private long contactNo;
    private String location;
}
