package ex7;

import ex6.*;

public class App7 {

    public static void main(String[] args) {

        float salarioTotal = 0, salarioBasico = 0, salarioMedio = 0, salarioUnuveritario = 0;

        Funcionario funcionario[] = new Funcionario[10];

        funcionario[0] = new FuncionarioBasico();
        funcionario[1] = new FuncionarioBasico();
        funcionario[2] = new FuncionarioBasico();
        funcionario[3] = new FuncionarioBasico();
        funcionario[4] = new FuncionarioMedio();
        funcionario[5] = new FuncionarioMedio();
        funcionario[6] = new FuncionarioMedio();
        funcionario[7] = new FuncionarioMedio();
        funcionario[8] = new FuncionarioUniversitario();
        funcionario[9] = new FuncionarioUniversitario();

        for (int i = 0; i < funcionario.length; i++) {
            if (funcionario[i].getClass() == FuncionarioBasico.class) {
                salarioBasico += funcionario[i].getRenda();
            } else if (funcionario[i].getClass() == FuncionarioMedio.class) {
                salarioMedio += funcionario[i].getRenda();
            } else {
                salarioUnuveritario += funcionario[i].getRenda();
            }
            salarioTotal += funcionario[i].getRenda();
        }

        System.out.println("Salarios de funcionarios com ensino basico: " + salarioBasico);
        System.out.println("Salarios de funcionarios com ensino medio: " + salarioMedio);
        System.out.println("Salarios de funcionarios com ensino universitrio: " + salarioUnuveritario);
        System.out.println("Salarios totais: " + salarioTotal);
    }
}
