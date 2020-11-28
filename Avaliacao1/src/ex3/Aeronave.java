package ex3;

/**
 * Aeronave
 */
public abstract class Aeronave {

    private int potenciaMotor;
    private int autonomia;
    private String origem;
    private String destino;

    public int getPotenciaMotor() {
        return this.potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public abstract void mostraAeronave();
}