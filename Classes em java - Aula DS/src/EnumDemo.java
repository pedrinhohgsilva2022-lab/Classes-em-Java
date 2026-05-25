enum StatusPedido {
    PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE
}

public class EnumDemo {
    static void main(String[] args) {
        StatusPedido status = StatusPedido.ENVIADO;

        System.out.println("Status atual do pedido: " + status);
    }
}
