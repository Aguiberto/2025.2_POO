import java.util.Scanner;

public class Q12{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[10];
        int soma = 0;

        for(int i = 0 ; i < 10; i++){
            System.out.println("Digite um numero para o array: ");
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Array: " + soma + " + " + array[i]);
            soma += array[i];
        }

        System.out.println("Total : " + soma);

        scanner.close();

    }
}