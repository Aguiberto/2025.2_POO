public class testeCubo{
    public static void main(String[] args){

        Cubo magico = new Cubo(5.0);

        double volume = magico.getVolume();

        System.out.println("O volume do cubo vale: " + volume);

    }
}