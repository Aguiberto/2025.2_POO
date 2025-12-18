public class FreteTerrestre extends Frete{

    //"SEM ATRIBUTOS" - Herdados da superclasse FRETE

    public FreteTerrestre(double distancia, double peso){

        // Uso dos atributos herdados para criar o construtor
        super(distancia, peso);
    }

    @Override
    public double getFrete(){
        return 0.01 * distancia * peso;
    }
}