package ex1;

public class ShowMusica extends TipoEvento {

    private String tipoIngreso;
    private String artista;

    public ShowMusica() {
        nome = "Show de Musica";
    }

    /**
     * @return String[] return the tipoIngreso
     */
    public String getTipoIngreso() {
        return tipoIngreso;
    }

    /**
     * @param tipoIngreso the tipoIngreso to set
     */
    public void setTipoIngreso(String tipoIngreso) {

        if (tipoIngreso.equals("Camarote") || tipoIngreso.equals("Cadeira") || tipoIngreso.equals("Gramado")) {
            this.tipoIngreso = tipoIngreso;
        } else {
            System.err.println("Insira un tipo de ingresso valido");
        }
    }

    /**
     * @return String return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return getNome() + "\n Artista: " + getArtista() + "\n tipo de ingreso: " + getTipoIngreso() + "\n valor: " + getValor();
    }
}
