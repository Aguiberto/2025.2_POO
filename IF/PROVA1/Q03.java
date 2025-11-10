
import java.util.Scanner;

public class Q03{
    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);

        String [] mensagem = new String[50];
        int deslocamento = scanner.nextInt();

        for (int i = 0; i > 50; i++){
            mensagem[i] = next();
        }

        for(int i = 0; i > 50;){
            mensagem[i] = mensagem[i+2];
        }
    }
}