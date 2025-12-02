// ArrayList : Melhor opção para ler uma lista
// LinkedList: Melhor opção para adicionar e remover elementos.

import java.util.*;

public class ListaAula{
    public static void main(String [] args){

        List<String> listaDeNomes = new ArrayList<>();

        //adicionar
        listaDeNomes.add("Maria");
        listaDeNomes.add("João");
        listaDeNomes.add("Pedro");
        listaDeNomes.add("Aguiberto");
        listaDeNomes.add("Karotchigi");

        // pegar um valor
        System.out.println("Primeiro nome: " + listaDeNomes.get(0));

        // alterar
        listaDeNomes.set(1,"Ana");
        System.out.println("Segundo nome: "+ listaDeNomes.get(1));

        // remver elemento
        listaDeNomes.remove(2);

        // Procurar por valor
        System.out.println(listaDeNomes.contains("Aguiberto"));
    }
}