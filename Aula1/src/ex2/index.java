package ex2;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculadora, insira 2 n�meros e apos o tipo de calculo");
		System.out.println("1- Para somar");
		System.out.println("2- Para subtrair");
		System.out.println("3- Para multiplicar");
		System.out.println("4- Para dividir");

		Calculadora calculadora = new Calculadora();
		
		System.out.println("Insira o primeiro N�");
		calculadora.setN1(input.nextFloat());
		
		System.out.println("Insira o segundo N�");
		calculadora.setN2(input.nextFloat());
		
		System.out.println("Insira o tipo de calculo");
		calculadora.setOperation(input.nextInt());
		
		calculadora.calcular();
		
		input.close();
		
	}

}