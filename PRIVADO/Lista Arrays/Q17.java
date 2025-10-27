import java.util.Scanner;

public class Q17{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] idades = new int [10];
        int sup_35 = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite a idade das pessoas: ");
            idades[i] = scanner.nextInt();

            if(idades[i] > 35){
                sup_35 += 1;
            }
        }

        System.out.println("A quantidade de pessoas com idade superior a 35 anoe é de: " + sup_35);
        scanner.close();
    }
}