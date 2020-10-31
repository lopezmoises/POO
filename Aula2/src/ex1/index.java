package ex1;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Imposto imposto = new Imposto();
		
		int resultado = 0;
		
		System.out.println("Insira o valor do salario para calcular o imposto");
		imposto.setSalario(input.nextFloat());

		if (imposto.getSalario() <= 1000) {
			resultado = 0;
		} else if (imposto.getSalario() > 1000 && imposto.getSalario() <= 2000) {
			resultado = 5;
		} else if (imposto.getSalario() > 2000 && imposto.getSalario() <= 3000) {
			resultado = 10;
		} else {
			resultado = 15;
		}
		
		System.out.println("O imposto aplicado ao seu salario e: " + resultado + "%.");
		
		input.close();

	}

}
