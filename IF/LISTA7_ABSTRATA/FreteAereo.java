public class FreteAereo extends Frete{

    private double seguro;

    public FreteAereo(double distancia, double peso, double seguro){
        super(distancia, peso);
        this.seguro = seguro;
        
    }

    @Override
    public double getFrete(){
        return (((0.01* distancia * peso)*2) + 0.001 * seguro); 
    }

    @Override
    public String toString(){
        return super.toString() + "Seguro = " + seguro;
    }

}