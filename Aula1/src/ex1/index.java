package ex1;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();

		System.out.println("Informe o nome: ");
		pessoa.setNome(input.nextLine());

		System.out.println("Informe o email: ");
		pessoa.setEmail(input.nextLine());

		System.out.println("Informe o telefone: ");
		pessoa.setTelefone(input.nextLine());

		System.out.println("\n");
		pessoa.exibeDados();

		input.close();
	}

}
