import java.util.List;

record Pedido(int id, List<String> itens){

    public Pedido{
        itens =List.copyOf(itens);
    }

}