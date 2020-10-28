package ex2;

public class Calculadora {

	private float n1; 
	
	private float n2;
	
	private float result;
	
	private int operation;

	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	public int getOperation() {
		return operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}
	
	public void calcular() {
		switch (operation) {
		case 1: {
			setResult(n1 + n2);
			break;
		}
		case 2: {
			setResult(n1 - n2);
			break;
		}
		case 3: {
			setResult(n1 * n2);
			break;
		}
		case 4: {
			setResult(n1 / n2);
			break;
		}
		default:
			throw new IllegalArgumentException("Valor inesperado: " + operation);
		}
		
		System.out.println("Resultado: " + result);
	}
}
