package trabalho_daniel.domain.repositories;

public interface Interface_Cargos {
    String NomeCargo();

    double SalarioBase();

    int HorasExigidas();

    Imposto[] getImpostos();
}