package ejerciciosomospnt;

import ejerciciosomospnt.model.Bebida;
import ejerciciosomospnt.model.Fruta;
import ejerciciosomospnt.model.Higiene;
import ejerciciosomospnt.model.Producto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioSomosPNT {

    public static void main(String[] args) {

        List<Producto> listaProductos = cargarProductos();

        for (Producto p : listaProductos) {
            System.out.println(p);
        }

        System.out.println("=============================");

        Producto masCaro = Collections.max(listaProductos);
        Producto masBarato = Collections.min(listaProductos);

        System.out.println("Producto más caro: " + masCaro.getNombre());
        System.out.println("Producto más barato: " + masBarato.getNombre());
    }

    private static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Bebida("Coca-Cola Zero", 1.5, 20));
        productos.add(new Bebida("Coca-Cola", 1.5, 18));
        productos.add(new Higiene("Shampoo Sedal", 500, 19));
        productos.add(new Fruta("Frutillas", 64));

        return productos;
    }

}
