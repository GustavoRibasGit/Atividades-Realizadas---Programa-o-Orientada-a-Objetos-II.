import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        Object [] itens = {"Carro", "Moto", "Ônibus"};
	    Object selectedValue = JOptionPane.showInputDialog(null, "Qual veículo você gostaria de cadastrar?","Selecione o veículo", 
        JOptionPane.INFORMATION_MESSAGE, null, itens, itens [1]);
        if (selectedValue == "Ônibus") {
        Veiculo veiculo = new Veiculo();
        veiculo.solicitarDados();
        Onibus onibus = new Onibus();
        onibus.solicitarDados();
        JOptionPane.showMessageDialog(null, "Onibus cadastrado:\nPlaca: " + veiculo.getPlaca() + "\nAno: " + veiculo.getAno() + "\nQtd de Assentos: " + onibus.getqntAssentos());
        } else if (selectedValue == "Carro") {
        Veiculo veiculo = new Veiculo();
        veiculo.solicitarDados();
        Carro carro = new Carro();
        carro.solicitarQntDeKm();
        JOptionPane.showMessageDialog(null, "Carro cadastrado:\nPlaca: " + veiculo.getPlaca() + "\nAno: " + veiculo.getAno() + "\nQtd de Km rodados: " + carro.getQntDeKm());
        } else if (selectedValue == "Moto"){
        Veiculo veiculo = new Veiculo();
        veiculo.solicitarDados();
        Moto moto = new Moto ();
        moto.solicitarQntDeFarois();
        JOptionPane.showMessageDialog(null, "Moto cadastrada:\nPlaca: " + veiculo.getPlaca() + "\nAno: " + veiculo.getAno() + "\nQtd de Farois: " + moto.getQntDeFarois());
        }
        }
    }