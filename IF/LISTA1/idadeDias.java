/*Programa que calcula a idade
a partir da quantidade de dias informado
 */

/*Como calcular:
 anos = 400 / 365
 meses = (400 % 365) / 30
 dias = ((400 % 365) % 30) */

import java.util.Scanner;

public class idadeDias{
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        int dias, meses, ano;
        int idadeDias;

        idadeDias = leitor.nextInt();

        ano = idadeDias / 365;
        meses = (idadeDias % 365) / 30;
        dias = (idadeDias % 365) % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        leitor.close();
    }
    
}