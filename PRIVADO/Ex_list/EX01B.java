import java.util.*;

public class EX01B{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        for(int i = 0; i< 5;i++){
            System.out.println("Quem são os convidados do casamento: ");
            nomes.add(scanner.nextLine());
        }

        System.out.println("Seus convidados são: " + nomes.toString());

        scanner.close();

    }
}