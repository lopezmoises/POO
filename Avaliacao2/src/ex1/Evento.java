package ex1;

import java.time.*;

public class Evento {

    private TipoEvento tipoEvento;
    private String nomeEvento;
    private LocalDate data;
    private int limitePublico;

    /**
     * @return TipoEvento return the tipoEvento
     */
    public String getTipoEvento() {
        return "Evento: " + tipoEvento.toString();
    }

    /**
     * @param tipoEvento the tipoEvento to set
     */
    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    /**
     * @return String return the nomeEvento
     */
    public String getNomeEvento() {
        return nomeEvento;
    }

    /**
     * @param nomeEvento the nomeEvento to set
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    /**
     * @return Date return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * @return int return the limitePublico
     */
    public int getLimitePublico() {
        return limitePublico;
    }

    /**
     * @param limitePublico the limitePublico to set
     */
    public void setLimitePublico(int limitePublico) {
        this.limitePublico = limitePublico;
    }

    @Override
    public String toString() {
        return getTipoEvento() + "\n nomeEvento: " + getNomeEvento() + "\n data: " + getData() + "\n limitePublico: "
                + getLimitePublico();
    }

}
