//aula do dia 05/04/2023, continuada no dia 12/04/2023 em diante
import javax.swing.JOptionPane;
public class Mensagem {
    public static void main (String args []){ 
JOptionPane.showMessageDialog(null, "Nada", "Nada", JOptionPane.PLAIN_MESSAGE); //
JOptionPane.showMessageDialog(null, "Deu pau", "Erro", JOptionPane.ERROR_MESSAGE); //X
JOptionPane.showMessageDialog(null, "Oxe boy", "Questão", JOptionPane.QUESTION_MESSAGE); //?
JOptionPane.showMessageDialog(null, "Comé qui é?", "Dúvida", JOptionPane.INFORMATION_MESSAGE); //!
JOptionPane.showMessageDialog(null, "Cuidado!", "Atenção", JOptionPane.WARNING_MESSAGE); //Atenção
JOptionPane.showConfirmDialog(null, "Vai ou num vai?", "Sim ou não", JOptionPane.YES_NO_CANCEL_OPTION); //sim ou não
Object [] itens = {"MAÇÃ", "PERA", "BANANA"};
	Object selectedValue = JOptionPane.showInputDialog(null, "Qual das frutas é a sua favorita?","Fruta Favorita", 
                JOptionPane.INFORMATION_MESSAGE, null, itens, itens [1]);
String inputValue = JOptionPane.showInputDialog("Qual teu nome?"); //
JOptionPane.showConfirmDialog(null, inputValue, "Nome", JOptionPane.PLAIN_MESSAGE);
JOptionPane.showConfirmDialog(null, selectedValue, "Fruta Favorita Escolhida:", JOptionPane.PLAIN_MESSAGE);
System.out.println(inputValue);
}
}