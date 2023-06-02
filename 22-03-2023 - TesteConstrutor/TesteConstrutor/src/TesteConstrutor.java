import java.util.Scanner;
public class TesteConstrutor {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        ContaTitular ct = new ContaTitular(ler.nextLine(), ler.nextLine());
        System.out.println("O seu nome é: "+ ct.nome+ " e seu sobrenome é: "+ ct.sobrenome);
    }
}