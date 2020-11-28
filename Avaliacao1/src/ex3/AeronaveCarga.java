package ex3;

/**
 * AeronaveCarga
 */
public class AeronaveCarga extends Aeronave {

    private int capacidade;
    private Produto tipoProduto;

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoProduto() {
        return "Produto: " + tipoProduto.getNome() + "\n\tPeso:" + tipoProduto.getPeso() + "Kg\n\tDestinatario:"
                + tipoProduto.getDestinatario();
    }

    public void setTipoProduto(Produto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    @Override
    public void mostraAeronave() {
        System.out.println("Aeronave de Carga\n\nPotencia do motor: " + getPotenciaMotor() + "HP\nAutonomia: " + getAutonomia()
                + "Km\nOrigem: " + getOrigem() + "\nDestino: " + getDestino() + "\nCapacidade de carga: "
                + getCapacidade() + "Un\nTipo de produto: " + getTipoProduto());
    }

}