package dofrancestrategi;


public class Main {
    public static void main(String[] args) {
        MediaStrategy estrategia = new Geometrica();      // troque por new Geometrica()
        Disciplina d = new Disciplina(estrategia);

        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();

        System.out.printf("P1: %.2f \nP2: %.2f  \nMedia: %.2f  \nSituacao: %s%n",
                d.getP1(), d.getP2(), d.getMedia(), d.getSituacao());
    }
}
