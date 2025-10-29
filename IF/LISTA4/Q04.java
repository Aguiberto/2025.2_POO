import java.util.Scanner;

public class Q04{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int [] n = new int [20];

        for(int i = 0; i < 20; i++){
            n[i] = scanner.nextInt();
        }
        
        int i = 0;
        int j = 19;

        while(i < j){
            int temp = n[i];
            n[i] = n[j];
            n[j] = temp;
            i++;
            j--;
        }

        for(int z = 0; z < 20; z++){
            System.out.printf("N[%d] = %d\n", z, n[z]);
        }
        scanner.close();
    }
}