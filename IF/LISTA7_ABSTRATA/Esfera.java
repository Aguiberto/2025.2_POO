public class Esfera extends Figura3D{

    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    @Override
    public double getVolume(){
        double volume = ((4.0 / 3.0) * Math.PI * Math.pow(raio,3));
        return volume;
    }

}