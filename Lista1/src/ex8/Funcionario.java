package ex8;

public class Funcionario {

    private String nome;
    private int codigo;
    protected Float renda = 1000f;
    protected Float comissao;

    public Funcionario(String c) {
        Comissoes comissoes = new Comissoes(c);
        this.comissao = comissoes.getAdicionalSalario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    protected Float getRenda() {
        return this.renda;
    }

    public Float getComissao() {
        return comissao;
    }

    public Float getRendaFinal(){
        return this.getRenda() + this.getComissao();
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", renda='" + getRenda() + "'" +
            ", comissao='" + getComissao() + "'" +
            "}";
    }

}
