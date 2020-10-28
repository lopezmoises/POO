package ex1;

public class Imposto {

	private Float Salario;

	public Float getSalario() {
		return Salario;
	}

	public void setSalario(Float salario) {
		Salario = salario;
	}
	
	public int calculaImposto() {
		
		if (getSalario() <= 1000) {
			return 0;
		} else if (getSalario() > 1000 && getSalario() <= 2000) {
			return 5;
		} else if (getSalario() > 2000 && getSalario() <= 3000) {
			return 10;
		} else {
			return 15;
		}
	}
}
