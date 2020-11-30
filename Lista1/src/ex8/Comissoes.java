package ex8;

/**
 * Comissoes
 */
public class Comissoes {

    private Float adicionalSalario;

    public Comissoes(String comissao) {
        switch (comissao) {
            case "Gerente":
                setAdicionalSalario(1500f);
                break;
            case "Supervisor":
                setAdicionalSalario(600f);
                break;
            case "Vendedor":
                setAdicionalSalario(250f);
                break;
            default:
                break;
        }
    }

    /**
     * @return Float return the adicionalSalario
     */
    public Float getAdicionalSalario() {
        return adicionalSalario;
    }

    /**
     * @param adicionalSalario the adicionalSalario to set
     */
    private void setAdicionalSalario(Float adicionalSalario) {
        this.adicionalSalario = adicionalSalario;
    }

}