import javax.swing.JOptionPane;
public class Veiculo {
    private int placa;
    private int ano;
    
    public void solicitarDados() {
        this.setPlaca(Integer.parseInt(JOptionPane.showInputDialog("Informe a placa do veículo:")));
        this.setAno(Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do veículo:")));
    }
    
    public int getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(int placa) {
        this.placa = placa;
    }
    
    public int getAno() {
        return this.ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
}