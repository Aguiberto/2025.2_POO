import java.util.Scanner;

public class ContaBancariaTeste{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        ContaBancaria minhaConta = new ContaBancaria();

        System.out.println("Você criou uma conta bancária!");
        System.out.println("Digite um valor para depósito: ");

        double valor = scanner.nextDouble();
        minhaConta.deposito(valor);

        System.out.println("Digite um valor para sacar: ");
        double saque = scanner.nextDouble();
        minhaConta.sacar(saque);

        System.out.println("Quer fazer um pix? é so informar o valor: ");
        double pix = scanner.nextDouble();
        minhaConta.pix(pix);

        double meuSaldo = minhaConta.getSaldo();

        System.out.println("Seu saldo é: " + meuSaldo + "R$!");
    }
}