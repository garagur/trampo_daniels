package trabalho_daniel.domain.repositories;

import org.springframework.stereotype.Repository;

@Repository
public interface interface_descontos {
    double calcular(double valorBase);

    String getNome();

    String getAno();

}
