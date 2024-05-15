public class Main {
    public static void main(String[] args) {
     Funcionario funcionario = new Funcionario("Mateus", 12, 10140, 100);
     Gerente gerente = new Gerente("Lucas", 22, 10141, 120);
     Lider lider = new Lider("João", 19, 10142, 110);

        System.out.println(funcionario.calcsal());
        System.out.println(gerente.calcsal());
        System.out.println(lider.calcsal());
    }
}