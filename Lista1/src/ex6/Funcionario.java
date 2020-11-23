package ex6;

public class Funcionario {

    private String nome;
    private int codigo;
    protected Float renda = 1000f;

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

    public Float getRenda() {
        return this.renda;
    }
}
