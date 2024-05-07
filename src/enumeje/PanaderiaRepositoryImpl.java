package enumeje;

import java.util.HashMap;
import java.util.Map;

class PanaderiaRepositoryImpl implements PanaderiaRepository {
    private Map<String, TipoPanaderia> panaderiaMap = new HashMap<>();

    public PanaderiaRepositoryImpl() {
        for (TipoPanaderia tipo : TipoPanaderia.values()) {
            panaderiaMap.put(tipo.getNombre(), tipo);
        }
    }

    @Override
    public TipoPanaderia findByName(String nombre) {
        return panaderiaMap.get(nombre);
    }
}
