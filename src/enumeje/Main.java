package enumeje;

public class Main {
    public static void main(String[] args) {
        PanaderiaRepository repository = new PanaderiaRepositoryImpl();
        PanaderiaService service = new PanaderiaService(repository);

        TipoPanaderia panaderia = service.getPanaderia("Pan Francés");
        if (panaderia != null) {
            System.out.println("Nombre: " + panaderia.getNombre());
            System.out.println("Precio: " + panaderia.getPrecio());
        }
    }
}
