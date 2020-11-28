package ex3;

/**
 * Produto
 */
public class Produto {

    private String nome;
    private Float peso;
    private String destinatario;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPeso() {
        return this.peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", peso='" + getPeso() + "'" + ", destinatario='" + getDestinatario()
                + "'" + "}";
    }

}