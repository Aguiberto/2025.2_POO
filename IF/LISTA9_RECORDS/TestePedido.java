import java.util.List;

public class TestePedido{
    public static void main(String args[]){

        Pedido compras = new Pedido(2562, List.of("Macarrão","Sabonete","Acido Sufurico","Amor"));

        System.out.println("A lista de compra tem:");
        System.out.println(compras);

    }
}