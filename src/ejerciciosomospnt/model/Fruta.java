package ejerciciosomospnt.model;

public class Fruta extends Producto {

    public Fruta(String nombre, int precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Precio: $" + this.getPrecio() + " /// Unidad de venta: kilo";
    }

}
