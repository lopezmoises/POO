package pessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Index {

	public static Scanner input = new Scanner(System.in);
	public static PessoaFisica fisica = new PessoaFisica();
	public static PessoaJuridica juridica = new PessoaJuridica();

	public static void main(String[] args) {
		menu();

	}

	public static void menu() {

		System.out.println("\n\n----------------MENU----------------");
		System.out.println("Escolha uma opçao: ");
		System.out.println("1- Pessoa Fisica ");
		System.out.println("2- Pessoa juridica ");
		System.out.println("3- Resultados ");

		int opcao = input.nextInt();
		input.nextLine();
		
		switch (opcao) {
		case 1: {
			System.out.println("Informe o seu nome: ");
			fisica.setNome(input.nextLine());
			System.out.println("Informe o seu endereço: ");
			fisica.setEndereco(input.nextLine());
			System.out.println("Informe o seu CPF:");
			fisica.setCpf(input.nextLong());
			System.out.println("Informe o seu salario:");
			fisica.setSalario(input.nextFloat());
			fisica.adicionaFisica(fisica);
			break;
		}
		case 2: {
			System.out.println("Informe o seu nome: ");
			juridica.setNome(input.nextLine());
			System.out.println("Informe o seu endereço: ");
			juridica.setEndereco(input.nextLine());
			System.out.println("Informe o seu CNPJ:");
			juridica.setImposto(input.nextLong());
			System.out.println("Informe o seu ramo de atividades:");
			juridica.setRamoAtividades(input.nextLine());
			input.nextLine();
			System.out.println("Informe o valor dos seus impostos pagos:");
			juridica.setImposto(input.nextFloat());
			juridica.adicionaJuruduca(juridica);
			break;
		}
		case 3: {
			ArrayList<PessoaFisica> listaFisicas = fisica.listaFisica();
			for (int i = 0; i < listaFisicas.size(); i++) {
				System.out.println("Nome: "+listaFisicas.get(i).getNome());
				System.out.println("Endereço: "+listaFisicas.get(i).getEndereco());
				System.out.println("CPF: "+listaFisicas.get(i).getCpf());
				System.out.println("Salario: "+listaFisicas.get(i).getSalario());
				System.out.println("\n\n---------------------------\n\n");
			}
			
			ArrayList<PessoaJuridica> listaJurudicas = juridica.listaJuridica();
	        for (int i = 0; i < listaJurudicas.size(); i++) {
	        	System.out.println("Nome: "+listaJurudicas.get(i).getNome());
	        	System.out.println("Endereço: "+listaJurudicas.get(i).getEndereco());
	        	System.out.println("CPF: "+listaJurudicas.get(i).getCNPJ());
	        	System.out.println("Ramo de atividades: "+listaJurudicas.get(i).getRamoAtividades());
	        	System.out.println("Salario: "+listaJurudicas.get(i).getImposto());
	            System.out.println("\n\n---------------------------\n\n");
	        }     
	        	        
			break;
		}
		default:
			throw new IllegalArgumentException("Valor inesperado: " + opcao);
		}

		if (opcao != 3) {
			menu();
		}
	}

}
