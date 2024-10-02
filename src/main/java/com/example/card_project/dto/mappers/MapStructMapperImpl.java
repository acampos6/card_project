package com.example.card_project.dto.mappers;

import com.example.card_project.dto.CardTypeGetDTO;
import com.example.card_project.dto.CreditCardSlimDto;
import com.example.card_project.dto.CustomerGetDTO;
import com.example.card_project.dto.CustomerPostDto;
import com.example.card_project.entity.CardType;
import com.example.card_project.entity.CreditCard;
import com.example.card_project.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class MapStructMapperImpl implements MapStructMapper{

    @Override
    public CardTypeGetDTO cardTypeGetDTO(CardType cardType) {

        if(cardType == null)
            return null;

        CardTypeGetDTO cardTypeGetDTO = new CardTypeGetDTO();

        cardTypeGetDTO.setCcType( cardType.getCcType());

        return cardTypeGetDTO;
    }

    @Override
    public Customer customerPostDTOToCustomer(CustomerPostDto customerPostDto) {

        if(customerPostDto == null)
            return null;

        Customer customer = new Customer();

        customer.setAddress( customerPostDto.getAddress());
        customer.setFname((customerPostDto.getFname()));
        customer.setLname(customerPostDto.getLname());
        return customer;
    }

    @Override
    public CustomerGetDTO customerToCustomerGetDTO(Customer customer) {

        if(customer == null)
            return null;

        CustomerGetDTO customerGetDTO = new CustomerGetDTO();

        customerGetDTO.setAddress(customer.getAddress());
        customerGetDTO.setFname(customer.getFname());
        customerGetDTO.setLname(customer.getLname());

        return customerGetDTO;
    }

    @Override
    public CreditCardSlimDto creditCardDTO(CreditCard creditCard) {

        if(creditCard == null)
            return null;

        CreditCardSlimDto creditCardSlimDto = new CreditCardSlimDto();

        creditCardSlimDto.setCcId( creditCard.getCcid());
        creditCardSlimDto.setCredit_Number(creditCard.getCredit_Number());

        return creditCardSlimDto;
    }
}
