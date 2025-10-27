import java.util.Scanner;

public class Robo{
    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        int posicao = 0;
        int casos = scanner.nextInt();
        String movimentos = scanner.next();
        int passo = 0;
        

        while(passo < casos){
            if( movimentos.equals("LEFT") ){
                posicao -= 1; 
                passo += 1;
            }
            if (movimentos.equals("RIGHT")){
                posicao += 1;
                passo += 1;
            }

        }

    }
}