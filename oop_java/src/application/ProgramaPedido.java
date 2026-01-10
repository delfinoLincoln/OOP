package application;

import entidades.Pedido;
import enums.StatusPedido;

import java.util.Date;

public class ProgramaPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1080, new Date(), StatusPedido.ESPERANDO_PAGAMENTO);

        System.out.println(pedido);

        StatusPedido sp1 = StatusPedido.ENTREGUE;
        StatusPedido sp2 = StatusPedido.valueOf("ENTREGUE");

        System.out.println(sp1);
        System.out.println(sp2);
    }
}
