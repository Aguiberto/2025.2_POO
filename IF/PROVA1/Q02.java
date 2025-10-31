import java.util.Scanner;

public class Q02{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero_casos = scanner.nextInt();
        int []teste = new int [numero_casos];

        for(int i = 0; i < teste.length; i++){
            teste[i] = scanner.nextInt();
        }

        int divisor = 1;
        int total = 0;

        for(int i = 0; i < teste.length; i++){
            for(int j = 0; j < teste[i]/2; j++){
                if(teste[i] % divisor == 0){
                    total += divisor;
                    divisor += 1;
                }
            }
              if(total == teste[i]){
                        System.out.printf(teste[i] + " eh perfeito");
                    }else{
                        System.out.printf(teste[i] + " nao eh perfeito");
                    }
        }
    }   
}