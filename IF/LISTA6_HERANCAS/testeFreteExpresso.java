public class testeFreteExpresso{
    public static void main(String[] args){

        FreteExpresso sedex = new FreteExpresso(150.0,76.5,200.0);

        double valor = sedex.ValorFrete();

        System.out.println("O valor do frete é: " + valor);

    }
}