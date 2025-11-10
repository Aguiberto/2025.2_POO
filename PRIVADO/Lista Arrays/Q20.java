import java.util.Scanner;

public class Q20{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double [] cotacao = new double [21];

        for(int i = 1; i <= 20; i++){
            cotacao[i] = 5.36 * i;
        }

        for(int i = 1; i <= 20; i++){
            System.out.printf(" %d dolar(es) vale %.2f R$!\n",i, cotacao[i]);
        }
        scanner.close();
    }
}