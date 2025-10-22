import java.util.Scanner;

/*
1 = 2 leds
2 , 3, 5 = 5 leds
4 = 4 leds
6, 9 , 0 = 6 leds
8 = 7 leds
 */

public class Led{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < casos; i++){
            String valor = scanner.nextLine();
            int leds = 0;

            for( int j = 0; j < valor.length();j++){
                char algarismo = valor.charAt(j);

                switch (algarismo) {

                    case '0','6','9':      leds += 6; break;
                    case '1':              leds += 2; break;
                    case '2', '3','5':     leds += 5; break;
                    case '4':              leds += 4; break;
                    case '7':              leds += 3; break;
                    case '8':              leds += 7; break;
                }
            }
            System.out.println(leds + " leds");
        }

        scanner.close();   
    }
}