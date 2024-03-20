import interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    private List<IObserver> observers = new ArrayList<>();

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (IObserver observer: observers) {
            observer.update();
        }
    }

    public void realizarCompra(String producto) {
        System.out.println("Realizando compra del producto: " + producto);

        CarritoDeComprasImpl.agregarProducto(producto);
        InventarioImpl.descontarUnidad();


        notifyObservers();
    }
}
