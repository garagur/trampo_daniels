package com.example.trabalhodaniel.user_cases;

import com.example.trabalhodaniel.domain.entity.Funcionario;
import com.example.trabalhodaniel.domain.entity.ReciboPagamento;
import com.example.trabalhodaniel.domain.repository.ImpressaoPort;
import com.example.trabalhodaniel.domain.repository.SalvarReciboPort;

import org.springframework.stereotype.Service;

@Service
public class ServicoRH {

        private final Calculo_Descontos calculoDescontos;
        private final Calculo_horas calculoHoras;
        private final ImpressaoPort impressao;
        private final SalvarReciboPort salvarRecibo;

        public ServicoRH(
                        Calculo_Descontos calculoDescontos,
                        Calculo_horas calculoHoras,
                        ImpressaoPort impressao,
                        SalvarReciboPort salvarRecibo) {
                this.calculoDescontos = calculoDescontos;
                this.calculoHoras = calculoHoras;
                this.impressao = impressao;
                this.salvarRecibo = salvarRecibo;
        }

        public void processarFolha(Funcionario funcionario) {

                double salarioBase = funcionario.getCargo().SalarioBase();

                double totalImpostos = calculoDescontos.calcularImpostos(
                                funcionario.getCargo(),
                                funcionario.getCargo().getImpostos());

                double ajusteHoras = calculoHoras.calcularSalarioLiquido(
                                funcionario.getCargo(),
                                funcionario.getHorasExtras(),
                                funcionario.getHorasDesconto());

                double salarioLiquido = ajusteHoras - totalImpostos;

                ReciboPagamento recibo = new ReciboPagamento(
                                funcionario, salarioBase, totalImpostos, salarioLiquido);
                salvarRecibo.salvar(recibo);

                // Imprimir no console
                impressao.imprimir(funcionario, salarioBase, totalImpostos, salarioLiquido);
        }
}
