import javax.swing.JOptionPane;
public class Carro {
    private int qntDeKm;
    
    public void solicitarQntDeKm() {
        this.setQntDeAssentos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de km rodados do carro:")));
    }
    
    public int getQntDeKm() {
        return this.qntDeKm;
    }
    
    public void setQntDeAssentos(int qntDeKm) {
        this.qntDeKm = qntDeKm;
    }
}