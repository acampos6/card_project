package com.example.card_project.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class CreditCardSlimDto {

    private Long ccId;

    private String credit_Number;

    private String cvv;
}
