package com.example.card_project.dto;

import lombok.Data;

import java.util.List;

@Data
public class CardTypeGetDTO {

    private String ccType;

    private String ccTypeD;

    private List<CreditCardSlimDto> creditCardSlimList;
}
