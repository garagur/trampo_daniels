package com.example.trabalhodaniel.domain.repository;

import com.example.trabalhodaniel.domain.entity.ReciboPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReciboRepository extends JpaRepository<ReciboPagamento, Long> {

}