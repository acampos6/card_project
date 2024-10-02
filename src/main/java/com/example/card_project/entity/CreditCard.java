package com.example.card_project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.beans.ConstructorProperties;
import java.sql.Time;
import java.sql.Timestamp;


@Entity
@Data
@Table(name = "credit_card")
public class CreditCard {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ccid;

    @Column(name = "credit_Number")
    private String credit_Number;

    @Column(name = "cvv")
    private String cvv;

    @Column(name = "expirationMonth")
    private String expirationMonth;

    @Column(name = "expirationYear")
    private String expirationYear;

    @ManyToOne
    @JoinColumn(name = "ccType")
    @JsonIgnore
    private CardType cardType;

    @ManyToOne
    @JoinColumn(name = "cid")
    @JsonIgnore
    private Customer customer;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;



}
