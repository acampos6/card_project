package com.example.card_project.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "cid")
    private Long cid;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "Address")
    private String Address;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CreditCard> creditCardsList;

    @CreationTimestamp
    @Column(name = "createdAt")
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "updatedAt")
    private Timestamp updateAt;

    public Customer(String fname, String lname, String address) {
        this.fname = fname;
        this.lname = lname;
        Address = address;
    }

    public Customer() {

    }
}
