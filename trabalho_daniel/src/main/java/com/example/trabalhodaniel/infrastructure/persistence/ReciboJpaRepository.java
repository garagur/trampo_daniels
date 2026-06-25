package com.example.trabalhodaniel.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReciboJpaRepository extends JpaRepository<ReciboPagamentoJpaEntity, Long> {
}