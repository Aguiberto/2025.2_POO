public class testeFreteTerrestre{
    public static void main(String[]args){

        FreteTerrestre mercado_livre = new FreteTerrestre(75.0, 13.0);

        double valor = mercado_livre.getFrete();

        System.out.println("O valor do frete é: " + valor + "R$");

    }
}