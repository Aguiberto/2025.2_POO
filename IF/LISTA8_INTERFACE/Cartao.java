public class Cartao implements Pagamento{

    private double limite;

    public Cartao(double limite){
        this.limite = limite;
    }

    @Override
    public boolean autorizar(double valor){
        if(valor <= limite){
            return true;
        }
        return false;
    }

}