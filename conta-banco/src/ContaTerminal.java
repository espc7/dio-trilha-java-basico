import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Insira o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua Conta:");
        Integer conta = scanner.nextInt();

        System.out.println("Qual o saldo da sua conta?");
        double saldo = scanner.nextDouble();

        String mensagem = geraMensagem(nome, agencia, conta, saldo);

        System.out.println(mensagem);
    }

    public static String geraMensagem(String nome, String agencia, Integer conta, Double saldo) {
        return "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque";
    }
}