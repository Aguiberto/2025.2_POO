import java.util.Scanner;

public class Maior{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

        int maiorAB = (((a+b)+Math.abs(a-b))/2); 

        int maior = maiorAB;

        if(c > maiorAB){
            maior = c;
        }
        System.out.println(maior + " eh o maior");
    }
}