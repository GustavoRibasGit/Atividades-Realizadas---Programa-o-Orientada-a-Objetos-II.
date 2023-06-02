import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Dados dados = new Dados();

        Colaborador colaborador = new Colaborador();
        colaborador.setCargo(JOptionPane.showInputDialog("Cargo do Colaborador:"));

        String mensagem = "Dados do Colaborador:\n" +
                "ID: " + dados.getId() + "\n" +
                "Nome: " + dados.getNome() + "\n" +
                "Número: " + dados.getNumero() + "\n" +
                "CEP: " + dados.getCep() + "\n" +
                "Telefone: " + dados.getTelefone() + "\n" +
                "CPF/CPNJ: " + dados.getCpfcnpj() + "\n" +
                "Bairro: " + dados.getBairro() + "\n" +
                "Cidade: " + dados.getCidade() + "\n" +
                "UF: " + dados.getUf();
                //"Cargo: " + colaborador.getCargo();
        JOptionPane.showMessageDialog(null, mensagem);
    }
}