package ex6;

public class FuncionarioMedio extends FuncionarioBasico {

    private String escola;

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public Float getRenda() {
        return super.getRenda() * 1.5f;
    }

}