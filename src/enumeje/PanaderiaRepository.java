package enumeje;

interface PanaderiaRepository {
    TipoPanaderia findByName(String nombre);
}