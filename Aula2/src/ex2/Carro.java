package ex2;

public class Carro {

	private String placa;
	private String chassi;
	private String cor;
	private String defeito;
		
	public Carro(String placa, String chassi, String cor, String defeito) {
		this.placa = placa;
		this.placa = placa;
		this.chassi = chassi;
		this.cor = cor;
		this.defeito = defeito;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getDefeito() {
		return defeito;
	}
	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}
	
	
}
