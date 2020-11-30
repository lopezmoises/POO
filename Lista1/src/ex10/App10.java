package ex10;

import ex8.*;

/**
 * App10
 */
public class App10 {

    public static void main(String[] args) {

        float salarioTotal = 0, salarioBasico = 0, salarioMedio = 0, salarioUnuveritario = 0;

        Funcionario funcionario[] = new Funcionario[10];

        funcionario[0] = new FuncionarioBasico("Vendedor");
        funcionario[1] = new FuncionarioBasico("Vendedor");
        funcionario[2] = new FuncionarioBasico("Vendedor");
        funcionario[3] = new FuncionarioBasico("Vendedor");
        funcionario[4] = new FuncionarioMedio("Vendedor");
        funcionario[5] = new FuncionarioMedio("Vendedor");
        funcionario[6] = new FuncionarioMedio("Vendedor");
        funcionario[7] = new FuncionarioMedio("Supervisor");
        funcionario[8] = new FuncionarioUniversitario("Supervisor");
        funcionario[9] = new FuncionarioUniversitario("Gerente");

        for (int i = 0; i < funcionario.length; i++) {
            if (funcionario[i].getClass() == FuncionarioBasico.class) {
                salarioBasico += funcionario[i].getRendaFinal();
            } else if (funcionario[i].getClass() == FuncionarioMedio.class) {
                salarioMedio += funcionario[i].getRendaFinal();
            } else {
                salarioUnuveritario += funcionario[i].getRendaFinal();
            }
            salarioTotal += funcionario[i].getRendaFinal();
        }

        System.out.println("Salarios de funcionarios com ensino basico: " + salarioBasico);
        System.out.println("Salarios de funcionarios com ensino medio: " + salarioMedio);
        System.out.println("Salarios de funcionarios com ensino universitrio: " + salarioUnuveritario);
        System.out.println("Salarios totais: " + salarioTotal);
    }
}