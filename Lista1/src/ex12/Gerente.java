package ex12;

/**
 * Gerente
 */
public class Gerente extends Funcionario {

    private String area;

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + getNome() + " - Data de nascimento: " + getNascimento() + " - Salario: " + getSalario()
                + " - Imposto: " + calculaImposto());
    }

    public float calculaImposto() {
        return getSalario() * 0.05f;
    }

    /**
     * @return String return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

}