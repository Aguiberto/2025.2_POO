public class Frete{

    private double distancia;
    private double peso;

    public double ValorFrete(){
        return 0.01 * distancia * peso;
    }

    // CONSTRUTOR
    public Frete( double distancia, double peso){
        this.distancia = distancia;
        this.peso = peso;
    }

    @Override
    public String toString(){
        return "{ distância = " + distancia + " / " + 
                " peso = " + peso + "}";
    }

}