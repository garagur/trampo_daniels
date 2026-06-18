package com.example.trabalhodaniel.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_recibos")
public class ReciboPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    private double salarioBase;
    private double totalImpostos;
    private double salarioLiquido;

    private LocalDateTime dataEmissao = LocalDateTime.now(); // Salva o dia e hora que gerou
}