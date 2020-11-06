package ex1;

public class PessoaJuridica extends Pessoa {

	private String CNPJ;
	
	private String Ramo_de_atividades;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getRamo_de_atividades() {
		return Ramo_de_atividades;
	}

	public void setRamo_de_atividades(String ramo_de_atividades) {
		Ramo_de_atividades = ramo_de_atividades;
	}
	
	public void PagaImposto(Float valor) {
		
	}
}
