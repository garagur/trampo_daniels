package com.example.trabalhodaniel.infrastructure.output;

import com.example.trabalhodaniel.domain.entity.ReciboPagamento;
import com.example.trabalhodaniel.domain.repository.ReciboRepository;
import com.example.trabalhodaniel.domain.repository.SalvarReciboPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalvarReciboBanco implements SalvarReciboPort {

    @Autowired
    private ReciboRepository reciboRepository;

    @Override
    public void salvar(ReciboPagamento recibo) {
        reciboRepository.save(recibo);
        System.out.println("-> [Banco de Dados] Recibo salvo com sucesso!");
    }
}