import java.util.Scanner;

public class Resto2{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        int numero = 10000;
        int entrada = scanner.nextInt();


        for(int i = 0 ; i <= numero; i++){
            if( i % entrada == 2){
                System.out.println(i);
            }
        } 
    }
}