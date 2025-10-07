/*Só colocar em um dicionário
e ler o valor quando o usuário
digitar o mês (chave)*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calendario{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer,String> Mes = new HashMap<>();

        Mes.put(1,"January");
        Mes.put(2,"February");
        Mes.put(3,"March");
        Mes.put(4,"April");
        Mes.put(5,"May");
        Mes.put(6,"June");
        Mes.put(7,"July");
        Mes.put(8,"August");
        Mes.put(9,"September");
        Mes.put(10,"October");
        Mes.put(11,"November");
        Mes.put(12,"December");
        
        int data = scanner.nextInt();

        if(Mes.containsKey(data)){
            System.out.println(Mes.get(data));
        }
        scanner.close();
    }
}