import interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class UsuarioImpl implements IObserver {
    private final List<String> productosComprados = new ArrayList<>();
    @Override
    public void update() {
        System.out.println("Se han comprado los siguientes productos: ");
        for (String producto: productosComprados ){
            System.out.println(producto);
        }
    }

    public void agregarProductoComprado(String producto){
        productosComprados.add(producto);
    }
}
