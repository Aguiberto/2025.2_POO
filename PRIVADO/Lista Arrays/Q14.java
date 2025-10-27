import java.util.Scanner;

public class Q14{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double [] array = new double [10];
        double media = 0;
        double total = 0;

        for( int i = 0; i < 10; i++){
            System.out.println("Digite valores para calcular a média");
            array[i] = scanner.nextInt();
            total += array[i];
        } 

        media = total / array.length;

        System.out.println("A média vale: " + media);

        scanner.close();

    }
}