import java.util.Scanner;

public class Q18{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] idades = new int [10];
        int maior = idades[0];
        int maior_final = 0;
        int menor = idades[0];
        int menor_final = 0;

        for(int i = 0 ; i < 10; i++){
            System.out.println("Informe da idade de cada pessoal: ");
            idades[i] = scanner.nextInt();

            if(idades[i] > maior){
                maior = idades[i];
                maior_final = i;
            }
            if(idades[i] < menor){
                menor = idades[i];
                menor_final = i;
            }
        }

        System.out.println("A pessoa de MENOR idade no grupo tem: " + menor + " anos! e está no posição de nº " + menor_final);
        System.out.println("A pessoa de MAIOR idade no grupo tem: " + maior  + " ! e está no posição de nº " + maior_final);

        scanner.close();
    }
}