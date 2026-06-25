package com.example.trabalhodaniel.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.trabalhodaniel.domain.entity.Funcionario;
import com.example.trabalhodaniel.domain.repository.FuncionarioRepository;
import com.example.trabalhodaniel.domain.repository.Interface_Cargos;
import com.example.trabalhodaniel.user_cases.ServicoRH;

@RestController
public class FuncionarioController {

    private final ServicoRH servicoRH;
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioController(ServicoRH servicoRH, FuncionarioRepository funcionarioRepository) {
        this.servicoRH = servicoRH;
        this.funcionarioRepository = funcionarioRepository;
    }

    public void processarFuncionario(
            String nome,
            Interface_Cargos cargo,
            int horasExtras,
            int horasDesconto) {

        Funcionario funcionario = new Funcionario(null, nome, cargo, horasExtras, horasDesconto);
        funcionario = funcionarioRepository.salvar(funcionario);
        servicoRH.processarFolha(funcionario);
    }
}