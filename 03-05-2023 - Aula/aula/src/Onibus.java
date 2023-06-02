import javax.swing.JOptionPane;
public class Onibus {
    private int qntAssentos ;
    
    public void solicitarDados() {  
        this.setqntAssentos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de assentos do onibus:")));
    }
    
    public int getqntAssentos() {
        return this.qntAssentos;
    }
    
    public void setqntAssentos(int qntAssentos) {
        this.qntAssentos = qntAssentos;
    }
}