import java.util.Scanner;

public class Tuitando{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String msg = scanner.nextLine();
        int tamanho = msg.length();

        if( tamanho <= 140){
            System.out.println("TWEET");
        } else {
            System.out.println("MUTE");
        }

    }
}