public class Quadrado extends Figuras{

    private double lado;

    public Quadrado(double lado){
       super(lado,lado);
    }

    public String toString(){
        return "{ Lado = " + lado + "}";
    }
}