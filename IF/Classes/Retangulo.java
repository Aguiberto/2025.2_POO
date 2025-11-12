public class Retangulo{

    private String nome = "Retângulo";
    private double base;
    private double altura;

    public void setBase(double b){
        if(b >= 0){
            base = b;
        }else{
            System.out.println("Valor inválido!");
        }
    }

    public void setAltura(double h){
        if( h >= 0){
            altura = h;
        }else{
            System.out.println("Valor inválido!");
        }
    }
     
    public double getBase(){
        return base;
    }

    public double getAltura(){
        return altura;
    }

    public double getArea(){
        return (base * altura);
    }

    public double getDiagonal(){
        return ((base*base)+(altura*altura));
    }

    public String toString(){
        String atributos = "Os atributos são: NOME, BASE  e  ALTURA";
        return atributos;
    }
}