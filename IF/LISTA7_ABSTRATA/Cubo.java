public class Cubo extends Figura3D{
    
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    @Override
    public double getVolume(){
        return Math.pow(lado,3);
    }
}