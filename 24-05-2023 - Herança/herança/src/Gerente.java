//import javax.swing.JOptionPane;
public class Gerente extends Funcionario {
	//private int senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha:"));
	//private int numeroDeFuncionariosGerenciados;
	public Gerente(){
	}
	public double getBonificacao() {
		return this.salario * 0.15;
		}
	/*public boolean autentica(int senha){
	if (this.senha == senha) {
	System.out.println ("Acesso Permitido!");
	return true;
	} else {
	System.out.println ("Acesso Negado!");
	return false;
	}
	}*/
}