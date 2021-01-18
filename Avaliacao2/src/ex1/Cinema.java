package ex1;

public class Cinema extends TipoEvento {

    private int nroPoltrona;
    private String filme;

    public Cinema() {
        nome = "Cinema";
    }

    /**
     * @return int return the nroPoltrona
     */
    public int getNroPoltrona() {
        return nroPoltrona;
    }

    /**
     * @param nroPoltrona the nroPoltrona to set
     */
    public void setNroPoltrona(int nroPoltrona) {
        this.nroPoltrona = nroPoltrona;
    }

    /**
     * @return String return the filme
     */
    public String getFilme() {
        return filme;
    }

    /**
     * @param filme the filme to set
     */
    public void setFilme(String filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return getNome() + "\n Filme: " + getFilme() + "\n nro de poltrona: " + getNroPoltrona() + "\n valor: " + getValor();
    }
}
