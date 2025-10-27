import java.util.Scanner;

public class Q02{
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int [5];
        int [] vetorB = new int [vetorA.length];

        for(int i = 0; i < 5; i++){
            vetorA[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < 5; i++){
            vetorB[i] = vetorA[i] * 2;
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Vetor A: " + vetorA[i] + " | " + "Vetor B: " + vetorB[i]);
        }

        scanner.close();

    }
}