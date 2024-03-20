import interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeComprasImpl implements IObserver {

    private static List<String> productos = new ArrayList<>();
    @Override
    public void update() {
        productos.clear();
        System.out.println("Se eliminaron todos los productos del carrito de compras");
    }

    public static void agregarProducto(String producto) {
        productos.add(producto);
        System.out.println("Se agrego el producto " + producto + " al carrito de compras");
    }
}
