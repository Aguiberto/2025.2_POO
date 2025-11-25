public class ContaBancaria{

    private double saldo = 0;

    boolean deposito(double valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    boolean sacar(double valor){
        if(valor <= this.saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    boolean pix(double valor){
        if(valor <= this.saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    double getSaldo(){
        return this.saldo;
    }


}