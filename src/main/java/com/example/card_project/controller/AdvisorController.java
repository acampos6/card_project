package com.example.card_project.controller;

import com.example.card_project.dto.CustomerGetDTO;
import com.example.card_project.dto.CustomerPostDto;
import com.example.card_project.dto.mappers.MapStructMapper;
import com.example.card_project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/advisor")
public class AdvisorController {

    @Autowired
    private MapStructMapper mapStructMapper;

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping()
    public ResponseEntity<Void> create(
            @RequestBody CustomerPostDto customerPostDto
    ) {
        customerRepository.save(
                mapStructMapper.customerPostDTOToCustomer(customerPostDto));

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerGetDTO> getById(
            @PathVariable(value = "id") long id
    ) {
        return new ResponseEntity<>(
                mapStructMapper.customerToCustomerGetDTO(
                        customerRepository.findById(id).get()
                ),
                HttpStatus.OK
        );
    }


}
