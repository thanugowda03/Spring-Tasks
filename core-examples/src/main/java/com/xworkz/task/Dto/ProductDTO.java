package com.xworkz.task.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

    public class ProductDTO {
        private int productId;
        private String productName;
        private int quantity;
        private String category;
        private String supplierEmail;
        private String code;
        private long contact;
        private String location;
    }


