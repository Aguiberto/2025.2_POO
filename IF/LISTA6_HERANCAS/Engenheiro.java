public class Engenheiro extends Funcionario{

    private String crea;

    public void setCrea(String crea){
        this.crea = crea;
    }

    public String getCrea(){
        return crea;
    }

    @Override
    public String toString(){
        return super.toString() + " / crea = " + crea + "}"; 
    }
}