package com.example.trabalhodaniel.controller;

import com.example.trabalhodaniel.domain.entity.Funcionario;
import com.example.trabalhodaniel.domain.repository.CargoFactoryPort;
import com.example.trabalhodaniel.domain.repository.FuncionarioRepository;
import com.example.trabalhodaniel.domain.repository.Imposto;
import com.example.trabalhodaniel.domain.repository.Interface_Cargos;
import com.example.trabalhodaniel.service.ServicoRH;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {

    private final ServicoRH servicoRH;
    private final CargoFactoryPort cargoFactory;
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioController(ServicoRH servicoRH, CargoFactoryPort cargoFactory,
            FuncionarioRepository funcionarioRepository) {
        this.servicoRH = servicoRH;
        this.cargoFactory = cargoFactory;
        this.funcionarioRepository = funcionarioRepository;
    }

    public void processarFuncionario(
            String nome,
            String nomeCargo,
            Imposto[] impostos,
            int horasExtras,
            int horasDesconto) {

        Interface_Cargos cargo = cargoFactory.criar(nomeCargo, impostos);

        Funcionario funcionario = new Funcionario(nome, cargo, horasExtras, horasDesconto);

        // Salvar funcionário no banco primeiro
        funcionario = funcionarioRepository.save(funcionario);

        // Depois processar a folha
        servicoRH.processarFolha(funcionario);
    }
}