public class testeFrete{
    public static void main(String [] args){

        Frete para_natal = new Frete(150.0 , 76.5);

        Double valor = para_natal.ValorFrete();
        System.out.println("O valor do frete é: " + valor);
    }
}