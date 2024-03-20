public class Main {

    public static void main(String[] args) {
        CarritoDeComprasImpl carritoDeCompras = new CarritoDeComprasImpl();
        InventarioImpl inventario = new InventarioImpl();
        UsuarioImpl usuario = new UsuarioImpl();
        Payment payment = new Payment();


        payment.addObserver(carritoDeCompras);
        payment.addObserver(inventario);
        payment.addObserver(usuario);


        String producto = "Producto 1";
        payment.realizarCompra(producto);

        CarritoDeComprasImpl.agregarProducto(producto);
        usuario.agregarProductoComprado(producto);

        producto = "Producto 2";
        payment.realizarCompra(producto);

        CarritoDeComprasImpl.agregarProducto(producto);
        usuario.agregarProductoComprado(producto);
    }
}
