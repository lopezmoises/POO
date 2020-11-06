package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

	public static ArrayList<PessoaFisica> pessoasFisicas = new ArrayList<PessoaFisica>();

	public static ArrayList<PessoaJuridica> pessoasJuridicas = new ArrayList<PessoaJuridica>();

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		inserirPessoas();

		scanner.close();
	}

	public static void inserirPessoas() {

		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();

		System.out.println("Insira F para pessoa fisica ou J para pessoa juridica");

		switch (scanner.nextLine()) {
		case "F": {
			System.out.println("Insira o nome: ");
			pf.setNome(scanner.nextLine());
			System.out.println("Insira o endereço: ");
			pf.setEndereco(scanner.nextLine());
			System.out.println("Insira o CPF: ");
			pf.setCPF(scanner.nextLine());
			System.out.println("Insira o salario: ");
			pf.recebeSalario(scanner.nextFloat());
			scanner.nextLine();
			
			pessoasFisicas.add(pf);
			break;
		}
		case "J": {
			System.out.println("Insira o nome: ");
			pj.setNome(scanner.nextLine());
			System.out.println("Insira o endereço: ");
			pj.setEndereco(scanner.nextLine());
			System.out.println("Insira o CNPJ: ");
			pj.setCNPJ(scanner.nextLine());
			System.out.println("Insira o ramo de atividade: ");
			pj.setRamo_de_atividades(scanner.nextLine());
			System.out.println("Insira o imposto: ");
			pj.PagaImposto(scanner.nextFloat());
			scanner.nextLine();

			pessoasJuridicas.add(pj);
			break;
		}
		default:
			System.err.println("Insira 'F' ou 'J': ");
			inserirPessoas();
		}

		System.out.println("Insira 1 para continuar");
		if (scanner.nextLine().equals("1")) {
			inserirPessoas();
		} else {
			mostrarPessoas();
		}
	}

	public static void mostrarPessoas() {
		int i = 1;

		for (PessoaFisica pessoaFisica : pessoasFisicas) {
			System.out.println("\nPessoa " + i);
			System.out.println("Nome: " + pessoaFisica.getNome());
			System.out.println("Endereço: " + pessoaFisica.getEndereco());
			System.out.println("CPF: " + pessoaFisica.getCPF());
			i++;
		}
		
		for (PessoaJuridica pessoaJuridica : pessoasJuridicas) {
			System.out.println("\nPessoa " + i);
			System.out.println("Nome: " + pessoaJuridica.getNome());
			System.out.println("Endereço: " + pessoaJuridica.getEndereco());
			System.out.println("CNPJ: " + pessoaJuridica.getCNPJ());
			System.out.println("Ramo de atividades: " + pessoaJuridica.getRamo_de_atividades());
			i++;
		}
	}

}
