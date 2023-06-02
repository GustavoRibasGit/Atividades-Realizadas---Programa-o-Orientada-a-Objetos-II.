import java.util.Scanner;
public class Contacorrente {
    public static void main(String args[]) {
    Scanner ler = new Scanner(System.in);
        float produtos;
        float produto;
        float valorproduto;
        float salario;
        float percento;
        String cargo;
        System.out.println("Qual o seu cargo?");
        cargo = ler.nextLine ();
        System.out.println("Digite o seu salário");
        salario = ler.nextFloat();
        System.out.println("Quantos produtos você vendeu?");
        produto = ler.nextFloat();
        System.out.println("Qual o valor dos produtos?");
        valorproduto = ler.nextFloat();
        produtos = produto*valorproduto;
        percento = (float) (produtos*0.10);
        System.out.print("Sua função é: ");
        System.out.print(cargo);
        System.out.print("\nO valor de sua comissão sera: ");
        System.out.print(produtos*0.10);
        System.out.print("\nSendo assim, seu salário final será: ");
        System.out.print(percento+salario);
    }
}