package ex6;

public class FuncionarioUniversitario extends FuncionarioMedio {

    private String Universidade;

    public String getUniversidade() {
        return Universidade;
    }

    public void setUniversidade(String Universidade) {
        this.Universidade = Universidade;
    }

    public Float getRenda() {
        return super.getRenda() * 2f;
    }
}
