import java.util.Scanner;

public class Q04{
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);

        double [] vetorA = new double[15];
        double [] vetorB = new double[vetorA.length];

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um valor para o array: ");
            vetorA[i] = scanner.nextInt();
        }
        for(int i = 0; i < vetorA.length; i++){
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Vetor A: " + vetorA[i] + " | " + "Vetor B: " + vetorB[i]);
        }
        scanner.close();
    }
}