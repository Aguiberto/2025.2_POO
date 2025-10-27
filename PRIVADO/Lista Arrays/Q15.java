import java.util.Scanner;

public class Q15{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] array = new int [10];
        int pares = 0;
        int impares = 0;
        
        for(int i = 0; i < 10; i++){

            System.out.println("Digite um valor para incrementar o array: ");
            array[i] = scanner.nextInt();

            if(array[i] % 2 == 0){
                pares += 1;
            } else {
                impares += 1;
            }
        }

        float percentual_par = ((float)pares / array.length) * 100;
        float percentual_impar = ((float)impares / array.length) * 100;

        System.out.println("O percentual de números PARES no Array e de: " + percentual_par + "% ");
        System.out.println("O percentual de números IMPARES no Array e de: " + percentual_impar + "% ");

        scanner.close();

    }
}