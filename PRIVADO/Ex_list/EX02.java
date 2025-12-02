import java.util.*;

public class EX02{
    public static void main(String[] args){

        List<Integer> numeros = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        numeros.add(67);
        numeros.add(9);
        numeros.add(21);
        numeros.add(17);
        numeros.add(13);
        numeros.add(77);
        numeros.add(66);
        numeros.add(7);
        numeros.add(6);

        System.out.println("Veja a lista: " + numeros.toString());
        System.out.println("Informe a posição do número que você deseja excluir: ");    
        numeros.remove(scanner.nextInt());

        System.out.println("A lista ficou da seguinte maneira: " + numeros.toString());

        scanner.close();
    }
}