import java.util.Scanner;

public class Dama{
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int mov = 0;

        while( x1 != 0 || x2 != 0 || y1 != 0 || y2 != 0){

            // pontos estão no mesmo lugar
            if(x1 == x2 && y1 == y2){
                mov = 0;

            // pontos alinhados verticalmente ou horizontalmente
            }else if(y1 == y2 || x1 == x2){
                mov = 1;

            // pontos alinhados na diagonal
            }else if(Math.abs((x1 - x2)) == Math.abs((y1 - y2))){
                mov =1;

            // pontos não alinhados
            }else{
                mov = 2;
            }

            System.out.println(mov);

            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();

        }

        scanner.close();

        System.exit(0);
         
    }
}