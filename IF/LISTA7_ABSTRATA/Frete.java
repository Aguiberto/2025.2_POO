public abstract class Frete {

    protected double distancia;
    protected double peso;

    public Frete(double distancia, double peso){
        this.distancia = distancia;
        this.peso = peso;
    }

    public abstract double getFrete();

    @Override
    public String toString(){
        return "{ Distância = " + distancia + " / " +
                "Peso = " + peso + "}";
    }
}