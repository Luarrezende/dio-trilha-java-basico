import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //desafio: simular uma conta bancária para o ususario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o número da sua agência: ");
        int agencia = scanner.nextInt();
        scanner.close();

        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");



    }
}
