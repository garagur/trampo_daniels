package trabalho_daniel.domain.repositories;

public interface CargoFactoryPort {

    Interface_Cargos criar(String nomeCargo, Imposto[] impostos);
}