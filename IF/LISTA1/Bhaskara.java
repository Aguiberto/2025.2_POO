import java.util.Scanner;

public class Bhaskara{
    public static void main(String[] args) {
        
        /*Fórmula de Bhaskara
         x = (-b +- Raiz((b*b)-(4*a*c)))/(2*a)
        */

        Scanner ler = new Scanner(System.in);

        double a,b,c;
        double delta;
        double bhaskara1, bhaskara2;

        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();

        delta = (b*b)-(4*a*c);


        if(a == 0 || delta < 0){
            System.out.println("Impossivel calcular");

            } else {
                bhaskara1 = ((-b) - Math.sqrt(delta))/(2*a);
                bhaskara2 = ((-b) + Math.sqrt(delta))/(2*a);
                System.out.printf("R1 = %.5f%n", bhaskara2);
                System.out.printf("R2 = %.5f%n", bhaskara1);
        }
        ler.close();
    }

}