public class Pix implements Pagamento{

    @Override
    public boolean autorizar(double valor){
        if(valor <= 5000.0){
            return true;
        } 
        return false;
    }

}