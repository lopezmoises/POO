package pessoas;

import java.util.ArrayList;

public class PessoaFisica extends Pessoa {

	private Long Cpf;
	private float Salario;
	private ArrayList<PessoaFisica> fisica = new ArrayList<PessoaFisica>();

	public Long getCpf() {
		return Cpf;
	}

	public void setCpf(Long cpf) {
		Cpf = cpf;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		Salario = salario;
	}

	public void adicionaFisica(PessoaFisica Pfisica) {
		fisica.add(Pfisica);
	}

	public ArrayList<PessoaFisica> listaFisica() {

		return fisica;
	}
}
