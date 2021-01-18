package ex1;

public class PartidaFutebol extends TipoEvento {

    private int nroCadeira;
    private String[] times = new String[2];

    public PartidaFutebol() {
        nome = "Partida de Futebol";
    }

    /**
     * @return int return the nroCadeira
     */
    public int getNroCadeira() {
        return nroCadeira;
    }

    /**
     * @param nroCadeira the nroCadeira to set
     */
    public void setNroCadeira(int nroCadeira) {
        this.nroCadeira = nroCadeira;
    }

    /**
     * @return String[] return the times
     */
    public String getTimes() {
        return times[0] + " VS " + times[1];
    }

    /**
     * @param times the times to set
     */
    public void setTimes(String[] times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return getNome() + "\n Numero de cadeira: " + getNroCadeira() + "\n times: " + getTimes() + "\n valor: " + getValor();
    }

}
