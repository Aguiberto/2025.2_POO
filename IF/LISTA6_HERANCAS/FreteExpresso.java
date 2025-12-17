public class FreteExpresso extends Frete{

    private double seguro;

    public FreteExpresso (double distancia, double peso, double seguro){
       super(distancia,peso);
       this.seguro = seguro;
    }

    @Override
    public double ValorFrete(){
        return (super.ValorFrete() * 2) + (0.001 * seguro);
        //return  ((getDistancia() * getPeso() * 0.01) * 2) + (0.001 * seguro);
    }

    @Override
    public String toString(){
        return "{ seguro = " + seguro +"}";
    }
}