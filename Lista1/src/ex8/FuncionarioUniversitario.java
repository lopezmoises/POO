package ex8;

public class FuncionarioUniversitario extends FuncionarioMedio {

    public FuncionarioUniversitario(String c) {
        super(c);
    }

    private String Universidade;

    public String getUniversidade() {
        return Universidade;
    }

    public void setUniversidade(String Universidade) {
        this.Universidade = Universidade;
    }

    protected Float getRenda() {
        return super.getRenda() * 2f;
    }

    public Float getRendaFinal() {
        return this.getRenda() + super.getComissao();
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", comissao='" + getComissao() + "'" + ", salario='"
                + getRendaFinal() + "'" + "}";
    }
}
