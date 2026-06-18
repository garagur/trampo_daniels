package com.example.trabalhodaniel;

import com.example.trabalhodaniel.infrastructure.cargo.CargoFactory;
import com.example.trabalhodaniel.infrastructure.cargo.DevJunior;
import com.example.trabalhodaniel.infrastructure.cargo.DevSenior;
import com.example.trabalhodaniel.infrastructure.cargo.Estagiario;
import com.example.trabalhodaniel.infrastructure.input.FuncionariosData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final CargoFactory factory;
    private final FuncionariosData dados;

    public Application(CargoFactory factory, FuncionariosData dados) {
        this.factory = factory;
        this.dados = dados;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        factory.registrar("DevSenior", impostos -> new DevSenior(impostos));
        factory.registrar("DevJunior", impostos -> new DevJunior(impostos));
        factory.registrar("Estagiario", impostos -> new Estagiario(impostos));

        dados.registrar();
    }
}