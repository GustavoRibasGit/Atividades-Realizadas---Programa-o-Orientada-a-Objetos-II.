import javax.swing.JOptionPane;
public class SaidaValoresInteiros{
    public static void main (String[] args) throws NumberFormatException {
        double valorA = Integer.parseInt (JOptionPane.showInputDialog("Informe a nota oficial do primeiro bimestre: "));
        double valorB = Integer.parseInt (JOptionPane.showInputDialog("Informe a nota parcial do primeiro bimestre: "));
        double valorC = Integer.parseInt (JOptionPane.showInputDialog("Informe a nota oficial do segundo bimestre: "));
        double valorD = Integer.parseInt (JOptionPane.showInputDialog("Informe a nota parcial do primeiro bimestre: "));
        double valorA1 = valorA*0.70;
        double valorB1 = valorB*0.30;
        double valorC1 = valorC*0.70;
        double valorD1 = valorD*0.30;
        double resultadoB = valorA1 + valorB1;
        double resultadoA = valorC1 + valorD1;
        double total = resultadoA + resultadoB;
        double media = total/2;
        if (media >= 7){
        JOptionPane.showMessageDialog(null, "Aprovado, resultado final: "+ media, "Aprovado", JOptionPane.INFORMATION_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(null, "Reprovado, resultado final: "+ media, "Reprovado", JOptionPane.ERROR_MESSAGE);
        }
    }
}