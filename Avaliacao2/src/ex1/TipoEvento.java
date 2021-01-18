package ex1;

public abstract class TipoEvento {
    
    private long id;
    private double valor;
    protected String nome; 

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return double return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return String[] return the nome
     */
    public String getNome() {
        return nome;
    }
}
