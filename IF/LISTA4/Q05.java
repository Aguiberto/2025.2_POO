import java.util.Scanner;

public class Q05{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] array = new int[1000];

        int entrada = scanner.nextInt();
        int h = 0;

        while( h < array.length){
            for(int i = 0; i < entrada; i++){
                array[h] = i;
                h += 1;
            }
            
        }
        for(int i = 0; i < array.length; i++){
            System.out.printf("N[%d] = %d\n" ,i ,array[i]);
        }
        

        scanner.close();
    }
}