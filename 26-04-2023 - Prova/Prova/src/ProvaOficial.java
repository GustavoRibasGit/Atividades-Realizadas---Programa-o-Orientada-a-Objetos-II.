import javax.swing.JOptionPane;
import java.util.Scanner;
public class ProvaOficial {
    public static void main(String[] args) {
        Object [] itens = {1, 2};
	Object selectedValue = JOptionPane.showInputDialog(null, "Escolha 1 para cadastrar ou 2 para listar os eventos","Eventos", 
                JOptionPane.INFORMATION_MESSAGE, null, itens, itens [1]);
        if(itens == 1){
        String titulo = JOptionPane.showInputDialog("Qual o titulo do evento?");
        String duracao = JOptionPane.showInputDialog("Qual a duração do evento?");
        String inicio = JOptionPane.showInputDialog("Qual a data de inicio do evento?");
        JOptionPane.showMessageDialog(null, "Evento salvo!", "Salvo!", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Lista de Eventos:");
        System.out.println("Título: "+ titulo);
        System.out.println("Data de ínicio: "+ inicio);
        System.out.println("Duração: "+ duracao);
        } else {
        System.out.println("Não há eventos cadastrados.");    
        }
    }
}
//aula do dia 05/04/2023, continuada no dia 12/04/2023 em diante
    //public static void main (String args []){ 
//JOptionPane.showMessageDialog(null, "Nada", "Nada", JOptionPane.PLAIN_MESSAGE); //
//JOptionPane.showMessageDialog(null, "Deu pau", "Erro", JOptionPane.ERROR_MESSAGE); //X
//JOptionPane.showMessageDialog(null, "Oxe boy", "Questão", JOptionPane.QUESTION_MESSAGE); //?
//JOptionPane.showMessageDialog(null, "Comé qui é?", "Dúvida", JOptionPane.INFORMATION_MESSAGE); //!
//JOptionPane.showMessageDialog(null, "Cuidado!", "Atenção", JOptionPane.WARNING_MESSAGE); //Atenção
//JOptionPane.showConfirmDialog(null, "Vai ou num vai?", "Sim ou não", JOptionPane.YES_NO_CANCEL_OPTION); //sim ou não
//Object [] itens = {"MAÇÃ", "PERA", "BANANA"};
//	Object selectedValue = JOptionPane.showInputDialog(null, "Qual das frutas é a sua favorita?","Fruta Favorita", 
//                JOptionPane.INFORMATION_MESSAGE, null, itens, itens [1]);
//String inputValue = JOptionPane.showInputDialog("Qual teu nome?"); //
//JOptionPane.showConfirmDialog(null, inputValue, "Nome", JOptionPane.PLAIN_MESSAGE);
//JOptionPane.showConfirmDialog(null, selectedValue, "Fruta Favorita Escolhida:", JOptionPane.PLAIN_MESSAGE);
//System.out.println(inputValue);