
import java.util.Scanner;

public class SenhaFixa{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String senha = scanner.next();

        while( !senha.equals("2002")){
            System.out.println("Senha Invalida");
            senha = scanner.next();
        }
        System.out.println("Acesso Permitido");
        scanner.close();
    }
}