package com.example.card_project.dto.mappers;

import com.example.card_project.dto.CreditCardSlimDto;
import com.example.card_project.dto.CustomerGetDTO;
import com.example.card_project.dto.CustomerPostDto;
import com.example.card_project.entity.CardType;

import com.example.card_project.dto.CardTypeGetDTO;
import com.example.card_project.entity.CreditCard;
import com.example.card_project.entity.Customer;

public interface MapStructMapper {

    CardTypeGetDTO cardTypeGetDTO(CardType cardType);

    Customer customerPostDTOToCustomer(CustomerPostDto customerPostDto);

    CustomerGetDTO customerToCustomerGetDTO(Customer customer);

    CreditCardSlimDto creditCardDTO(CreditCard creditCard);
}
