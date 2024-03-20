import interfaces.IObserver;

public class InventarioImpl implements IObserver {
    private static Integer unidadesDisponibles = 10;

    public static void descontarUnidad() {
        unidadesDisponibles -= 1;
    }

    @Override
    public void update() {
        System.out.println("Se desconto una unidad del inventario. Unidadses disponibles: " + unidadesDisponibles);
    }
}
