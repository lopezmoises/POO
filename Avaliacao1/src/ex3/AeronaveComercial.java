package ex3;

/**
 * AeronaveComercial
 */
public class AeronaveComercial extends Aeronave {

    private int numeroMaxPassageiros;
    private int executiva;
    private int economica;

    /**
     * @return int return the numeroMaxPassageiros
     */
    public int getNumeroMaxPassageiros() {
        return numeroMaxPassageiros;
    }

    /**
     * @param numeroMaxPassageiros the numeroMaxPassageiros to set
     */
    public void setNumeroMaxPassageiros(int numeroMaxPassageiros) {
        this.numeroMaxPassageiros = numeroMaxPassageiros;
    }

    /**
     * @return int return the executiva
     */
    public int getExecutiva() {
        return executiva;
    }

    /**
     * @param executiva the executiva to set
     */
    public void setExecutiva(int executiva) {
        this.executiva = executiva;
    }

    /**
     * @return int return the economica
     */
    public int getEconomica() {
        return economica;
    }

    /**
     * @param economica the economica to set
     */
    public void setEconomica(int economica) {
        this.economica = economica;
    }

    @Override
    public void mostraAeronave() {
        System.out.println("Aeronave Comercial\n\nPotencia do motor: " + getPotenciaMotor() + "HP\nAutonomia: " + getAutonomia()
                + "Km\nOrigem: " + getOrigem() + "\nDestino: " + getDestino() + "\nNumero maximo de passageiros: "
                + getNumeroMaxPassageiros() + "\nPassageiros em classe executiva: " + getExecutiva()
                + "\nPassageiros em classe economica: " + getEconomica() + "\n\n");
    }

}