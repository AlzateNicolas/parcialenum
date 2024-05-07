package enumeje;

public enum TipoPanaderia {
    PAN_FRANCES("Pan Francés", 1.0),
    PAN_INTEGRAL("Pan Integral", 1.5),
    BAGUETTE("Baguette", 2.0),
    PAN_DE_CENTENO("Pan de Centeno", 1.2);

    private String nombre;
    private double precio;

    TipoPanaderia(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
