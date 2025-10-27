import java.util.Scanner;

public class Q05{
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        int [] vetorA = new int [10];
        int [] vetorB = new int [vetorA.length];

        for(int i = 0 ; i < vetorA.length; i++){
            System.out.println("Digite um valor para o array: ");
            vetorA[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * i;
        }
        for(int i = 0 ; i < vetorA.length; i++){
            System.out.println("VetorA: " + vetorA[i] + " | " + "VetorB: " + vetorB[i]);
        }
        scanner.close();
    }
}