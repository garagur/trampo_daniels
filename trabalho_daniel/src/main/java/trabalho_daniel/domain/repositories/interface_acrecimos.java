package trabalho_daniel.domain.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface interface_acrecimos {
    double calcular(double valorBase);

    String getNome();

    String getAno();
}