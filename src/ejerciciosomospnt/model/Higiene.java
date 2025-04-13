package ejerciciosomospnt.model;

public class Higiene extends Producto {

    private int contenidoMl;

    public Higiene(String nombre, int contenidoMl, int precio) {
        super(nombre, precio);
        this.contenidoMl = contenidoMl;
    }

    public int getContenidoMl() {
        return contenidoMl;
    }

    public void setContenidoMl(int contenidoMl) {
        this.contenidoMl = contenidoMl;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + " /// Contenido: " + this.contenidoMl + " /// Precio: $" + this.getPrecio();
    }

}
