import java.util.Scanner;

public class Q08{
    public static void main(String[] args){

        Scanner scanner = new  Scanner(System.in);
        
        int [] vetorA = new int[10];
        int [] vetorB = new int[vetorA.length];
        int [] vetorC = new int[vetorA.length];

        for(int i = 0; i < 10; i++){
            System.out.println("Informe um valor para o array ["+i+"]");
            vetorA[i] = scanner.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Informe um valor para o array ["+i+"]");
            vetorB[i] = scanner.nextInt();
        }
        for(int i = 0; i < 10; i++){
            vetorC[i] = vetorA[i] * vetorB[i];
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Vetor A: " + vetorA[i] + " | " + "Vetor B: " + vetorB[i] + " | " + "Vetor C: " + vetorC[i]);
        }

        scanner.close();

    }
}