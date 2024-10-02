package com.example.card_project.repository;

import com.example.card_project.entity.CardType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardTypeRepository extends JpaRepository<CardType, String> {
}
