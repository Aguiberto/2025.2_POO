import  java.util.Scanner;

public class Q09{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] vetorA = new int [10];
        int [] vetorB = new int [vetorA.length];
        int [] vetorC = new int [vetorA.length];

        for(int i = 0; i < 10; i++){
            System.out.println("Informe um valor para o Array A:");
            vetorA[i] = scanner.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Informe um valor para o Array B:");
            vetorB[i] = scanner.nextInt();
        }
        for(int i = 0; i < 10; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Vetor A: " + vetorA[i] + " | " + "Vetor B: " + vetorB[i] + " | " + "Vetor C: " + vetorC[i]);
        }

        scanner.close();

    }
}