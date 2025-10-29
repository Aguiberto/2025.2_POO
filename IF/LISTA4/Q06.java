import java.util.Scanner;

public class Q06{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int tamanho = scanner.nextInt();
        int [] array = new int [tamanho];


        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        int menor = array[0];
        int posicao = 0;

        for(int i = 0; i < array.length; i++){
            if (array[i] < menor){
                menor = array[i];
                posicao = i;
            }
        }

        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Posicao: %d\n", posicao);


        scanner.close();
    }
}