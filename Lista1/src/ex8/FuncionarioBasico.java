package ex8;

public class FuncionarioBasico extends Funcionario {

    public FuncionarioBasico(String c){
        super(c);
    }

    private String escola;

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    protected Float getRenda() {
        return super.getRenda() * 1.1f;
    }

    public Float getRendaFinal() {
        return this.getRenda() + super.getComissao();
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", comissao='" + getComissao() + "'" +
            ", salario='" + getRendaFinal() + "'" +
            "}";
    }


}
