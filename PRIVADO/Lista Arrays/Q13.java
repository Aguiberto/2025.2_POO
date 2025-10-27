import java.util.Scanner;

public class Q13{
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        int [] array = new int [10];
        int soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite algum valor pro array: ");
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10 ; j++){

                soma = array[i] + array[j];

                if(soma % 5 == 0){
                    System.out.println("Array["+i+"]: " + array[i] + " + " + "Array["+j+"]: " + array[j] + " : é divisível por 5!!");
                }
            }
        }

        scanner.close();
    }
}