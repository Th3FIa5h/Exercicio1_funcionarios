public class Lider extends Funcionario {
    public Lider(String nome, double valorhora, int Cod_empresa, int horatrabalhadames) {
        super(nome, valorhora, Cod_empresa, horatrabalhadames);
    }

    public double calcsal() {
        return super.calcsal() * 1.05;
    }
}