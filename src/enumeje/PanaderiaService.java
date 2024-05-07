package enumeje;

class PanaderiaService {
    private PanaderiaRepository repository;

    public PanaderiaService(PanaderiaRepository repository) {
        this.repository = repository;
    }

    public TipoPanaderia getPanaderia(String nombre) {
        return repository.findByName(nombre);
    }
}

