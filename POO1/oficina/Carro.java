package oficina;

import java.util.ArrayList;

public class Carro {
    private String Placa;
    private String Chassi;
    private String Cor;
    private String Defeito;
    private ArrayList<Carro> carro = new ArrayList<Carro>();

    /**
     * @return String return the Placa
     */
    public String getPlaca() {
        return Placa;
    }

    /**
     * @param Placa the Placa to set
     */
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    /**
     * @return String return the Chassi
     */
    public String getChassi() {
        return Chassi;
    }

    /**
     * @param Chassi the Chassi to set
     */
    public void setChassi(String Chassi) {
        this.Chassi = Chassi;
    }

    /**
     * @return String return the Cor
     */
    public String getCor() {
        return Cor;
    }

    /**
     * @param Cor the Cor to set
     */
    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    /**
     * @return String return the Defeito
     */
    public String getDefeito() {
        return Defeito;
    }

    /**
     * @param Defeito the Defeito to set
     */
    public void setDefeito(String Defeito) {
        this.Defeito = Defeito;
    }
    
    public void adicionaVeiculo(Carro auto) {
		carro.add(auto);
	}

    public ArrayList<Carro> listaVeiculos() {
		
    	return carro;
	}
}