import java.util.Scanner;

public class Q10{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int [10];
        int [] vetorB = new int [vetorA.length];

        for(int i = 0; i < 10; i++){
            vetorA[i] = scanner.nextInt();
        }
        for(int i = 0; i < 10; i++){
            vetorB[i] = vetorA[i] % 2;
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Vetor A["+i+"] % 2 = " + vetorB[i] );
        }

        scanner.close();
    }
}