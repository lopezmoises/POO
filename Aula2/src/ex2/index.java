package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {

		ArrayList<Carro> carros = new ArrayList<Carro>();

		String placa, chassi, cor, defeito;

		boolean control = true;

		Scanner scanner = new Scanner(System.in);

		while (control) {
			System.out.println("Insira a placa do carro");
			placa = scanner.nextLine();
			System.out.println("Insira nro de chassi do carro");
			chassi = scanner.nextLine();
			System.out.println("Insira a cor do carro");
			cor = scanner.nextLine();
			System.out.println("Insira defeito  do carro");
			defeito = scanner.nextLine();

			if (!carros.contains(new Carro (placa, chassi, cor, defeito))) {
				carros.add(new Carro(placa, chassi, cor, defeito));
			}

			System.out.println("Para sair escreva 'exit'");

			if (scanner.nextLine().equals("exit")) {
				control = false;
			}
		}

		System.out.println("Lista de carros:");

		for (Carro car : carros) {
			System.out.println("Placa: " + car.getPlaca());
			System.out.println("Cassi: " + car.getChassi());
			System.out.println("Cor: " + car.getCor());
			System.out.println("Defeito: " + car.getDefeito());
			System.out.println("\n");
		}

		scanner.close();
	}

}
