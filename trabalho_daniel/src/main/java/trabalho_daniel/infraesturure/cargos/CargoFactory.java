package trabalho_daniel.infraesturure.cargos;

import trabalho_daniel.domain.repositories.CargoFactoryPort;
import trabalho_daniel.domain.repositories.Imposto;
import trabalho_daniel.domain.repositories.Interface_Cargos;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CargoFactory implements CargoFactoryPort {

    private final Map<String, Function<Imposto[], Interface_Cargos>> registro = new HashMap<>();

    public void registrar(String nomeCargo, Function<Imposto[], Interface_Cargos> criador) {
        registro.put(nomeCargo, criador);
    }

    @Override
    public Interface_Cargos criar(String nomeCargo, Imposto[] impostos) {
        Function<Imposto[], Interface_Cargos> criador = registro.get(nomeCargo);

        if (criador == null) {
            throw new IllegalArgumentException("Cargo não registrado: " + nomeCargo);
        }

        return criador.apply(impostos);
    }
}