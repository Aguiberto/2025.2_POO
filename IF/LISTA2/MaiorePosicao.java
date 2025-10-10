import java.util.Scanner;

public class MaiorePosicao{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int tamanho = 100;
        int maior = 0;
        int entrada;
        int posicao = 0;
        int posicao_maior = 0;

        for(int i = 1; i <= tamanho; i++){
            entrada = scanner.nextInt();
            posicao += 1;
            if(entrada > maior){
                maior = entrada;
                posicao_maior = posicao;
            }
        }
        System.out.println(maior);
        System.out.println(posicao_maior);
    }
}

