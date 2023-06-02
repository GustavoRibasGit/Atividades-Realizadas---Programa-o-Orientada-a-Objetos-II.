import javax.swing.JOptionPane;
	public class Main {
    public static void main(String[] args) {		
		Object [] itens = {"Funcionário", "Gerente"};
	    Object selectedValue = JOptionPane.showInputDialog(null, "Você é um funcionário normal ou um gerente?","Selecione a função", 
        JOptionPane.INFORMATION_MESSAGE, null, itens, itens [1]);
        if (selectedValue == "Funcionário") {
		Funcionario funcionario = new Funcionario ();
		JOptionPane.showMessageDialog(null, "Nome do Funcionário: "+ funcionario.nome + "\nSalário do Funcionario: " + funcionario.salario + 
		"\nBonificação: " + funcionario.getBonificacao() + "\nSalário Bonificado: "+ (funcionario.salario+funcionario.getBonificacao()));
		}
		if (selectedValue == "Gerente"){
		Gerente gerente = new Gerente();
		JOptionPane.showMessageDialog(null, "Gerente:\nNome do Gerente: " + gerente.nome + "\nSalário do Gerente: " + gerente.salario + 
		"\nBonificação: " + gerente.getBonificacao() + "\nSalário Bonificado: "+ (gerente.salario+gerente.getBonificacao()));
		}
    }
}