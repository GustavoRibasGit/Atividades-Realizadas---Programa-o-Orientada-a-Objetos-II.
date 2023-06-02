public class Carro {
    private int velocidade;
    private int aceleracao;
    private int reducao;

    public Carro(int vel, int acel, int red) {
        velocidade = vel;
        aceleracao = acel;
        reducao = red;
    }

    public void acelerar() {
        velocidade += aceleracao;
        System.out.println("Acelerando, velocidade atual: " + velocidade);
    }

    public void reduzir() {
        velocidade -= reducao;
        System.out.println("Reduzindo, velocidade atual: " + velocidade);
    }

    public void buzinar() {
        System.out.println("bi bi");
    }
}