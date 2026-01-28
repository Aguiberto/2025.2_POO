import java.util.Scanner;

public class TesteEmail{
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu email: ");
        Email cliente1 = new Email(scanner.next());

        System.out.println(cliente1);

        scanner.close();
    }
}