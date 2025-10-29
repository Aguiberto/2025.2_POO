import java.util.Scanner;

public class Q09{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] entrada = new int [2];

        for(int i = 0; i < entrada.length;i++){
            entrada[i] = scanner.nextInt();
        }

        int [] alturas = new int [entrada[1]];
        for(int i = 0 ; i < alturas.length; i++){
            alturas[i] = scanner.nextInt();
        }

        boolean vitoria = false;

        for(int i = 0; i < alturas.length - 1; i++){
            if(entrada[0] + alturas[i] > alturas[i+1]){
                vitoria = true;
            }
        }

        if(vitoria){
            System.out.println("YOU WIN");
        }else{
            System.out.println("GAME OVER");
        }
        scanner.close();

    }
}