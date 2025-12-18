public class Motorista extends Funcionario{
    
    private String cnh;

    public void setCNH(String cnh){
        this.cnh = cnh;
    }

    public String getCNH(){
        return cnh;
    }

    @Override
    public String toString(){
        return super.toString() + " / cnh = " + cnh + "}";
    }
}