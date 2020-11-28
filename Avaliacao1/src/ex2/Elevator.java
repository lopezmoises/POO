package ex2;

/**
 * Elevator
 */
public class Elevator implements Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidadeCarga;
    private int cargaAtual;
    private int quantidadePessoas;
    private int quantidadePessoasAtual;

    public Elevator(int capacidadeCarga, int quantidadePessoas, int totalAndares) {
        setCapacidadeCarga(capacidadeCarga);
        setQuantidadePessoas(quantidadePessoas);
        setTotalAndares(totalAndares);
        setAndarAtual(0);
        setCargaAtual(0);
        setQuantidadePessoasAtual(0);
    }

    @Override
    public void entraPessoa(int peso) {
        if (cargaAtual + peso < capacidadeCarga && quantidadePessoasAtual < quantidadePessoas) {
            cargaAtual += peso;
            quantidadePessoasAtual += 1;
        } else {
            System.err.println("Elevador cheio");
        }
    }

    @Override
    public void saiPessoa(int peso) {
        if (cargaAtual != 0 && quantidadePessoasAtual != 0) {
            cargaAtual -= peso;
            quantidadePessoasAtual -= 1;
        } else {
            System.err.println("Elevador vazio");
        }
    }

    @Override
    public void sobeAndar() {
        if (andarAtual < totalAndares) {
            andarAtual += 1;
        } else {
            System.err.println("O elevador esta no ultimo andar");
        }
    }

    @Override
    public void desceAndar() {
        if (andarAtual > 0) {
            andarAtual += 1;
        } else {
            System.err.println("O elevador esta no terreo");
        }
    }

    /**
     * @return int return the andarAtual
     */
    public int getAndarAtual() {
        return andarAtual;
    }

    /**
     * @param andarAtual the andarAtual to set
     */
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    /**
     * @return int return the totalAndares
     */
    public int getTotalAndares() {
        return totalAndares;
    }

    /**
     * @param totalAndares the totalAndares to set
     */
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    /**
     * @return int return the capacidadeCarga
     */
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    /**
     * @param capacidadeCarga the capacidadeCarga to set
     */
    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * @return int return the quantidadePessoas
     */
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    /**
     * @param quantidadePessoas the quantidadePessoas to set
     */
    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    /**
     * @return int return the quantidadePessoasAtual
     */
    public int getQuantidadePessoasAtual() {
        return quantidadePessoasAtual;
    }

    /**
     * @param quantidadePessoasAtual the quantidadePessoasAtual to set
     */
    public void setQuantidadePessoasAtual(int quantidadePessoasAtual) {
        this.quantidadePessoasAtual = quantidadePessoasAtual;
    }

    /**
     * @return int return the cargaAtual
     */
    public int getCargaAtual() {
        return cargaAtual;
    }

    /**
     * @param cargaAtual the cargaAtual to set
     */
    public void setCargaAtual(int cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    @Override
    public String toString() {
        return "{" + " andarAtual='" + getAndarAtual() + "'" + ", totalAndares='" + getTotalAndares() + "'"
                + ", capacidadeCarga='" + getCapacidadeCarga() + "'" + ", cargaAtual='" + getCargaAtual() + "'"
                + ", quantidadePessoas='" + getQuantidadePessoas() + "'" + ", quantidadePessoasAtual='"
                + getQuantidadePessoasAtual() + "'" + "}";
    }

}