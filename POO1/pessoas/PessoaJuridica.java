package pessoas;

import java.util.ArrayList;

public class PessoaJuridica extends Pessoa {

	private long CNPJ;
	private String RamoAtividades;
	private float Imposto;
	private ArrayList<PessoaJuridica> juridica = new ArrayList<PessoaJuridica>();
	
	public long getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(long cNPJ) {
		CNPJ = cNPJ;
	}
	public String getRamoAtividades() {
		return RamoAtividades;
	}
	public void setRamoAtividades(String ramoAtividades) {
		RamoAtividades = ramoAtividades;
	}
	public float getImposto() {
		return Imposto;
	}
	public void setImposto(float imposto) {
		Imposto = imposto;
	}
	
	public void adicionaJuruduca(PessoaJuridica Pjuruduca) {
		juridica.add(Pjuruduca);
	}

	public ArrayList<PessoaJuridica> listaJuridica() {

		return juridica;
	}

	
}
