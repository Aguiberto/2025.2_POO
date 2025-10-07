import java.util.Scanner;

public class Consumo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        int distancia = scanner.nextInt();
        float combustivel = scanner.next();
        float consumo = distancia / combustivel;

        System.out.printf("%.3f km/l %n ",consumo);    

        scanner.close();
    }
    
}