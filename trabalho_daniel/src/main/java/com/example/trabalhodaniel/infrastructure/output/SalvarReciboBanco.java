package com.example.trabalhodaniel.infrastructure.output;

import com.example.trabalhodaniel.domain.entity.ReciboPagamento;
import com.example.trabalhodaniel.domain.repository.SalvarReciboPort;
import com.example.trabalhodaniel.infrastructure.persistence.FuncionarioJpaEntity;
import com.example.trabalhodaniel.infrastructure.persistence.FuncionarioJpaRepository;
import com.example.trabalhodaniel.infrastructure.persistence.ReciboPagamentoJpaEntity;
import com.example.trabalhodaniel.infrastructure.persistence.ReciboJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SalvarReciboBanco implements SalvarReciboPort {

    private final ReciboJpaRepository reciboRepository;
    private final FuncionarioJpaRepository funcionarioRepository;

    @Override
    public void salvar(ReciboPagamento recibo) {
        FuncionarioJpaEntity funcionarioEntity = funcionarioRepository
                .findById(recibo.getFuncionario().getId())
                .orElseThrow(() -> new IllegalArgumentException("Funcionário não encontrado"));

        ReciboPagamentoJpaEntity entity = new ReciboPagamentoJpaEntity(
                null,
                funcionarioEntity,
                recibo.getSalarioBase(),
                recibo.getTotalImpostos(),
                recibo.getSalarioLiquido(),
                recibo.getDataEmissao());

        reciboRepository.save(entity);
    }
}