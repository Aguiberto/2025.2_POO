
import java.util.Scanner;

public class SenhaFixa{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String senha = scanner.next();

        while( senha != "2022"){
            System.out.println("Senha Invalida");
            senha = scanner.next();
        }
        System.out.println("Acesso Permitido");
    }
}