import java.util.Scanner;
public class CarroEMoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade inicial do carro ");
        int velCarro = scanner.nextInt();
        System.out.print("Digite a velocidade para acelerar o carro ");
        int acelCarro = scanner.nextInt();
        System.out.print("Digite a velocidade para reduzir o carro ");
        int redCarro = scanner.nextInt();

        Carro carro = new Carro(velCarro, acelCarro, redCarro);

        System.out.print("Digite a velocidade inicial da moto ");
        int velMoto = scanner.nextInt();
        System.out.print("Digite a velocidade para acelerar a moto ");
        int acelMoto = scanner.nextInt();
        System.out.print("Digite a velocidade para reduzir a moto ");
        int redMoto = scanner.nextInt();

        Moto moto = new Moto(velMoto, acelMoto, redMoto);

        System.out.println("Carro");
        carro.acelerar();
        carro.reduzir();
        carro.buzinar();
        System.out.println("Moto");
        moto.acelerar();
        moto.reduzir();
        moto.buzinar();
        scanner.close();
    }
}