package trabalho_daniel.domain.repositories;

import org.springframework.stereotype.Repository;
import trabalho_daniel.domain.entities.Funcionario_construtor;
import trabalho_daniel.domain.entities.Cargo_holerite;

@Repository

public interface interface_impressao {
    void imprimir(Funcionario_construtor funcionario, Cargo_holerite holerite);
}