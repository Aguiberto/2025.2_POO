import java.util.Scanner;

public class Q16{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] array = new int [10];
        int menor_15 = 0;
        int igual_15 = 0;
        int superior_15 = 0;
        int qtd_superior_15 = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite valores para incrementar o array: ");
            array[i] = scanner.nextInt();
            if(array[i] < 15){
                menor_15 += 1;
            }
            if(array[i] == 15){
                igual_15 += 1;
            }
            if(array[i] > 15){
                superior_15 += array[i];
                qtd_superior_15 += 1;
            }
        }

        float media_maior_15 = ((float)superior_15 / qtd_superior_15);

        System.out.println("MENOR que 15: " + menor_15);
        System.out.println("IGUAL 15: " + igual_15);
        System.out.println("MEDIA dos maiores que 15: " + media_maior_15);
        System.out.println("QUATIDADE de números maiores que 15: " + qtd_superior_15);

        scanner.close();
    }
}