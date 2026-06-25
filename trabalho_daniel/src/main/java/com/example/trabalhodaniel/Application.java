package com.example.trabalhodaniel;

import com.example.trabalhodaniel.infrastructure.input.FuncionariosData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final FuncionariosData dados;

    public Application(FuncionariosData dados) {
        this.dados = dados;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        dados.registrar();
    }
}