package com.example.trabalhodaniel.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FuncionarioJpaRepository extends JpaRepository<FuncionarioJpaEntity, Long> {
    Optional<FuncionarioJpaEntity> findByNome(String nome);
}