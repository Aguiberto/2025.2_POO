public class testeFreteAereo{
    public static void main(String[] args){

        FreteAereo drone = new FreteAereo(75.0,234.0,1245.67);

        double valor = drone.getFrete();

        System.out.println("O valor do frete é: " + valor);

    }
}