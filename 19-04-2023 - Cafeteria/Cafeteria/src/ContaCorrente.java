public class ContaCorrente {
    
    private double saldoInicial;
    private double saldoDisponivel;
    private String senha;
    
    public ContaCorrente(double saldoInicial, String senha) {
        this.saldoInicial = saldoInicial;
        this.saldoDisponivel = saldoInicial;
        this.senha = senha;
    }
    
    public double getSaldoInicial() {
        return saldoInicial;
    }
    
    public double getSaldoDisponivel(String senha) {
        if (this.senha.equals(senha)) {
            return saldoDisponivel;
        } else {
            System.out.println("Senha incorreta!");
            return 0;
        }
    }
    
    public void sacar(double valor, String senha) {
        if (this.senha.equals(senha) && valor <= saldoDisponivel) {
            saldoDisponivel -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else if (this.senha.equals(senha) && valor > saldoDisponivel) {
            System.out.println("Saldo insuficiente!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}