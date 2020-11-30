package ex12;

/**
 * Funcionario
 */
public class Funcionario extends Pessoa {

    private float salario;

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + getNome() + " - Data de nascimento: " + getNascimento() + " - Salario: " + getSalario()
                + " - Imposto: " + calculaImposto());
    }

    public float calculaImposto() {
        return getSalario() * 0.03f;
    }

    /**
     * @return Float return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

}