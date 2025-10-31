import java.util.Scanner;

public class Q02A{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // int numero_casos = scanner.nextInt();
        int teste = scanner.nextInt();


        int divisor = 1;
        int total = 0;

        for(int i = 0; i < 6; i++){
            if(teste % divisor == 0){
                total += divisor;
                divisor += 1;
            }
        }

        if(total == teste){
            System.out.printf(teste + "eh perfeito");
        }else{
            System.out.println( teste + "nao eh perfeito");
        }
        scanner.close();    
    }
}