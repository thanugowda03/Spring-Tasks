package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookDTO {
    private int bookId;
    private String bookName;
    private int pages;
    private String category;
    private String email;
    private String password;
    private long phoneNo;
    private String shelf;
}
