import java.util.Scanner;

public class Soma{


    public static void main(String[] args) {

        int a,b,x;

        Scanner ler = new Scanner(System.in);
        
        a = ler.nextInt();
        b = ler.nextInt();

        x = a+b;

        System.out.printf("X = " + x + "\n");
    }

}