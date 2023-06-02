public class Moto {
    private int velocidade;
    private int aceleracao;
    private int reducao;

    public Moto(int vel, int acel, int redz) {
        velocidade = vel;
        aceleracao = acel;
        reducao = redz;
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