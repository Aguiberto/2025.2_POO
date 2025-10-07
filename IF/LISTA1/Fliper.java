/*Fliper
0 = porta a esquerda
1 = porta a direitoa */

import java.util.Scanner;

public class Fliper{
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);

        int portaP,portaR;

        portaP = leitor.nextInt();
        portaR = leitor.nextInt();

        if(portaP == 0){
            System.out.println("C");
        }
        if(portaP == 1){
            if(portaR == 0){
                System.out.println("B");
            }else{
                System.out.println("A");
            }
        }
        leitor.close();
    }
}