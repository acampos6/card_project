package com.example.card_project.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "cardtype")
public class CardType {

    @Id
    @Column(name = "ccType")
    private String ccType;

    @Column(name = "ccTypeD")
    private String ccTypeD;

    @Column(name = "updateAt")
    private Timestamp updatedAt;

    @Column(name = "createdAt")
    private Timestamp createdAt;


    public CardType() {
    }

    public CardType(String ccType, String ccTypeD) {
        this.ccType = ccType;
        this.ccTypeD = ccTypeD;
    }

}
