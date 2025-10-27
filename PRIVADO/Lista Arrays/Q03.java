import java.util.Scanner;

public class Q03{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int [15];
        int [] vetorB = new int [vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor para o array: ");
            vetorA[i] = scanner.nextInt();
        }

        for(int i = 0; i < vetorA.length; i ++){
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        for(int i = 0 ; i < vetorA.length; i++){
            System.out.println("Vetor A: " + vetorA[i] + " | " + "Vetor B: " + vetorB[i]);
        }

        scanner.close();
    }
}