import java.util.*;

public class ListaLigada{
    public static void main(String[] args){

       List<Integer> numeros = new LinkedList<>();

       numeros.add(1);
       numeros.add(2);
       numeros.add(3);
       numeros.add(4);

        System.out.println(numeros.get(3));

        numeros.remove(0);

        // ver os valores da lista
        System.out.println(numeros.toString());

        // coloca um valor em uma posição escolhida
        numeros.set(0,22);

        System.out.println(numeros.get(0));




    }
}