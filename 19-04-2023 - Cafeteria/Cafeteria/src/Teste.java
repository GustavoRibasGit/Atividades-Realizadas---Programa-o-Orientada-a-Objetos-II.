import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // cria uma conta corrente com saldo inicial de 1000 e senha "123"
    ContaCorrente conta = new ContaCorrente(1000, "123");
    
    // solicita a senha do usuário
    System.out.print("Digite sua senha: ");
    String senha = scanner.nextLine();
    
    // verifica a senha e exibe o saldo inicial
    System.out.println("Saldo inicial: " + conta.getSaldoInicial());
    System.out.println("Saldo disponível: " + conta.getSaldoDisponivel(senha));
    
    // realiza um saque
    System.out.print("Digite o valor a sacar: ");
    double valor = scanner.nextDouble();
    conta.sacar(valor, senha);
    
    // exibe o saldo disponível após o saque
    System.out.println("Saldo disponível: " + conta.getSaldoDisponivel(senha));
    
    scanner.close();
}
}