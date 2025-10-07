
import java.util.Scanner;

public class Area{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double c = scanner.nextDouble();

        Double areaTriangulo = (a * c) / 2;
        Double areaCirculo = 3.14159*(c*c);
        Double areaTrapezio = (a+b) * (c / 2);
        Double areaQuadrado = b*b;
        Double areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        scanner.close();
    }
}