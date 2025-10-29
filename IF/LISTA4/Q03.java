import java.util.Scanner;

public class Q03{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int [] array = new int [10];
        
        array[0] = valor;

        for(int i = 1; i < 10; i++){
            array[i] = array[i-1] * 2;
        }
        for( int i = 0; i < 10;i++){
            System.out.printf("N[%d] = %d\n" , i, array[i]);
        }
        scanner.close();
    }
}