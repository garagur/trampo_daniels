package com.example.trabalhodaniel.infrastructure.persistence;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_recibos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReciboPagamentoJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private FuncionarioJpaEntity funcionario;

    private double salarioBase;
    private double totalImpostos;
    private double salarioLiquido;
    private LocalDateTime dataEmissao;
}