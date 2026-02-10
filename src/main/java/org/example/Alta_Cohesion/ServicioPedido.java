package org.example.Alta_Cohesion;

public class ServicioPedido {

    private PedidoRepository repository;
    private NotificadorEmail notificador;

    public ServicioPedido(PedidoRepository repository,
                          NotificadorEmail notificador) {
        this.repository = repository;
        this.notificador = notificador;
    }

    public void procesarPedido(Pedido pedido, double precioUnitario) {
        double total = pedido.calcularTotal(precioUnitario);
        repository.guardar(pedido);
        notificador.enviarConfirmacion(pedido);

        System.out.println("     Total del pedido: " + total);
    }
}
