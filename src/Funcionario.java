public class Funcionario{
    public String nome;
    private double valorhora;
    public int Cod_empresa;
    public int horatrabalhadames;

    public Funcionario(String nome, double valorhora, int cod_empresa, int horatrabalhadames) {
        this.nome = nome;
        this.valorhora = valorhora;
        this.Cod_empresa = cod_empresa;
        this.horatrabalhadames = horatrabalhadames;
    }
    public double calcsal(){
        return valorhora * horatrabalhadames;
    }
}
