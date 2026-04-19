package trabalho.infrestructure.adapter;

import java.util.List;

import trabalho.application.usecases.servico_rh;
import trabalho.domain.entities.Funcionario_construtor;
import trabalho.domain.entities.trabalho_devSenior;
import trabalho.domain.entities.trabalho_devjunior;
import trabalho.domain.entities.desconto_INSS26;
import trabalho.domain.entities.desconto_imposto_generico26;
import trabalho.domain.entities.desconto_horas;
import trabalho.domain.entities.acrecimo_horas;
import trabalho.domain.repositories.interface_descontos;
import trabalho.domain.repositories.interface_acrecimos;

public class Funcionario_inserir_dados {

        private final servico_rh rh;

        public Funcionario_inserir_dados(servico_rh rh) {
                this.rh = rh;
        }

        public void executar() {

                // aqui dentro vai os funcionarios, de maneira escalavel para colocar todos os
                // dados deles fds!
                Funcionario_construtor funcionario1 = new Funcionario_construtor("duerer vivaldi", 20.0, 5.0);

                List<interface_descontos> descontosSenior1 = List.of(
                                new desconto_INSS26(),
                                new desconto_imposto_generico26(),
                                new desconto_horas(funcionario1));
                List<interface_acrecimos> acrecimosSenior1 = List.of(
                                new acrecimo_horas(funcionario1));

                trabalho_devSenior cargoSenior1 = new trabalho_devSenior(4000.0, descontosSenior1, acrecimosSenior1);
                funcionario1.setCargo(cargoSenior1);

                rh.processarFolha(funcionario1);

                Funcionario_construtor funcionario2 = new Funcionario_construtor("mc estudo", 10.0, 0.0);

                List<interface_descontos> descontosSenior2 = List.of(
                                new desconto_imposto_generico26(),
                                new desconto_horas(funcionario2));
                List<interface_acrecimos> acrecimosSenior2 = List.of(
                                new acrecimo_horas(funcionario2));

                trabalho_devjunior cargoSenior2 = new trabalho_devjunior(3500.0, descontosSenior2, acrecimosSenior2);
                funcionario2.setCargo(cargoSenior2);

                rh.processarFolha(funcionario2);
        }
}