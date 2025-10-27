import java.util.Scanner;

public class Q19{

    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    float [] nota1 = new float [10];
    float [] nota2 = new float [10];
    float [] media = new float [10];
    String [] resutados = new String [10];

    for(int i = 0; i < 10; i++){
        System.out.println("Informe a PRIMEIRA nota do aluno" + (i+1) +":");
        nota1[i] = scanner.nextInt();
    }
    for(int i = 0; i < 10; i++){
        System.out.println("Informe a SEGUNDA nota do aluno" + (i+1) +":");
        nota2[i] = scanner.nextInt();
    }
    for(int i = 0; i < 10; i++){
        media[i] = (nota1[i] + nota2[i]) / 2;
        if( media[i] >= 7 ){
            resutados[i] = "APROVADO";
        } else {
            resutados[i] = "EM RECUPERAÇÃO";
        }
    }

    for(int i = 0; i < 10; i++){
        System.out.println("Aluno["+i+"]" + " está " + resutados[i]);
    }

    scanner.close();
    }
}