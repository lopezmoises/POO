package ex6;

public class FuncionarioBasico extends Funcionario {

    private String escola;

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public Float getRenda() {
        return super.getRenda() * 1.1f;
    }

}
