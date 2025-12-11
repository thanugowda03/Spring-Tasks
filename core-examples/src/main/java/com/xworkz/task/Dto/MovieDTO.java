package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MovieDTO {
    private int movieId;
    private String movieName;
    private int duration;
    private String genre;
    private String email;
    private String password;
    private long phone;
    private String language;
}
