import java.util.Scanner;

public class Q11{
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        int [] array = new int [10];
        int conta_par = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor: ");
            array[i] = scanner.nextInt();
            if( array[i] % 2 == 0){
                conta_par += 1;
            }
        }
        System.out.println("A quantidade de pares é: " + conta_par);

        scanner.close();
    }
}