import javax.swing.JOptionPane;
public class Bonificacao extends Funcionario {
    protected double gerarBonificacao;
    protected double salarioBonificado = salario*gerarBonificacao;
    public Bonificacao () {
        this.gerarBonificacao = Double.parseDouble(JOptionPane.showInputDialog("Valor da Bonificação: "));
    }
    public Double getGerarBonificacao() {
        return gerarBonificacao;
    }
    public void setGerarBonificacao(Double gerarBonificacao) {
        this.gerarBonificacao = gerarBonificacao;
    }
    }