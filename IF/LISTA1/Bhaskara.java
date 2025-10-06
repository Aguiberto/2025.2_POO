import java.util.Scanner;

public class Bhaskara{
    public static void main(String[] args) {
        
        /*Fórmula de Bhaskara
         x = (-b +- Raiz((b*b)-4*(a*c)))/(2*a)
        */

        Scanner ler = new Scanner(System.in);

        double a,b,c;
        double delta;
        double bhaskara1, bhaskara2;

        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();

        delta = (b*b)-4*(a*c);


        if(a != 0){
            if(delta > 0){

                bhaskara1 = ((-b) - Math.sqrt(delta))/2*a;
                bhaskara2 = ((-b) + Math.sqrt(delta))/2*a;
                System.out.println("R1 = " + bhaskara1);
                System.out.println("R2 = " + bhaskara2);


            } else {
                System.err.println("Impossivel calcular");
            }
        } else {
            System.out.print("Impossivel calcular");
        }

    }


}