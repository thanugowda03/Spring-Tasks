package com.xworkz.task.Dto;

import lombok.*;

@Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    public class PaymentDTO {
        private int paymentId;
        private String payerName;
        private int amount;
        private String mode;
        private String email;
        private String password;
        private long phone;
        private String location;
    }


