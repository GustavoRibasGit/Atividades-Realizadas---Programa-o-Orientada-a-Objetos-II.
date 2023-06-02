import java.util.Scanner;
public class Horario {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        String nome, nome2, nome3, inicio, inicio2, inicio3, evento1, evento2, evento3;
        int horario, horario2, horario3, opçao;
               
        System.out.print("\nDigite o nome do evento:\t");
        nome = ler.nextLine ();
        System.out.print("\nDigite a data de início do evento:\t");
        inicio = ler.nextLine();
        System.out.print("\nDigite o horário do evento:\t ");
        horario = ler.nextInt ();
        evento1 = nome + horario + inicio;
        System.out.print ("\nEvento 1 cadastrado");
        System.out.print("\nVocê quer listar os eventos ou criar um novo?");
        System.out.print("\nDigite 1 para listar e 2 para criar um novo \t");
        opçao = ler.nextInt ();
        if (opçao == 2){ 
        System.out.print("\nDigite o nome do evento:\t");
        nome2 = ler.nextLine ();
        System.out.print("\nDigite a data de início do evento:\t");
        inicio2 = ler.nextLine();
        System.out.print("\nDigite o horário do evento:\t ");
        horario2 = ler.nextInt ();
        evento2 = nome2 + horario2 + inicio2;
        System.out.print ("\nEvento 2 cadastrado");
        System.out.print("\nVocê quer listar os eventos ou criar um novo?");
        System.out.print("\nDigite 1 para listar e 2 para criar um novo \t");
        } else {
        System.out.print (evento1);
        } if (opçao == 2){
        System.out.print("\nDigite o nome do evento:\t");
        nome3 = ler.nextLine ();
        System.out.print("\nDigite a data de início do evento:\t");
        inicio3 = ler.nextLine();
        System.out.print("\nDigite o horário do evento:\t ");
        horario3 = ler.nextInt ();
        evento3 = nome3 + horario3 + inicio3;
        System.out.print ("\nEvento 3 cadastrado");
        System.out.print("\nNão há mais espaços para eventos");
        System.out.print("\nSegue abaixo a lista de eventos: \t");
        System.out.print(evento1);
        System.out.print(evento2);
        System.out.print(evento3);
        } else {
        System.out.print(evento1);
        System.out.print(evento2);
        }
    }
}