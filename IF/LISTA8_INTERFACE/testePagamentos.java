public class testePagamentos{
    public static void main(String[] args){

        Pagamento moderno = new Pix();
        Pagamento antigo = new Cartao(2000.0);

        double televisao = 4900.0;
        double celular = 2100.0;

        boolean compra1 = moderno.autorizar(televisao);
        boolean compra2 = antigo.autorizar(celular);

        System.out.println("Status pagamento TV: " + compra1);
        System.out.println("Status pagamento Celular: " + compra2);

    }
}