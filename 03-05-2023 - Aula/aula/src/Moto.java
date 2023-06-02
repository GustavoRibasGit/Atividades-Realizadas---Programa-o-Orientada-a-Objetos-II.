import javax.swing.JOptionPane;
public class Moto {
    private int qntDeFarois;
    
    public void solicitarQntDeFarois() {
        this.setQntDeFarois(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de farois rodados da moto:")));
    }
    
    public int getQntDeFarois() {
        return this.qntDeFarois;
    }
    
    public void setQntDeFarois(int qntDeFarois) {
        this.qntDeFarois = qntDeFarois;
    }
}