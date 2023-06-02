import javax.swing.JOptionPane;
public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    public Funcionario() {
        this.nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        this.cpf = JOptionPane.showInputDialog("Digite o seu CPF ou CNPJ: ");
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
    }
    public double getBonificacao() {
		return this.salario * 0.10;
		}
}