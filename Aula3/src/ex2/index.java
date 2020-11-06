package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

	public static Scanner scanner = new Scanner(System.in);

	public static ArrayList<Cd> cds = new ArrayList<>();

	public static ArrayList<Dvd> dvds = new ArrayList<>();

	public static ArrayList<PenDrive> penDrives = new ArrayList<>();

	public static void main(String[] args) {
		registraMidias();

	}

	public static void registraMidias() {

		Cd cd = new Cd();
		Dvd dvd = new Dvd();
		PenDrive penDrive = new PenDrive();

		System.out.println("Seleccione o tipo de Midia\n 1- CD \n 2- DVD \n 3- PenDrive");
		switch (scanner.nextLine()) {
		case "1": {
			System.out.println("Insira o titulo:");
			cd.setTitulo(scanner.nextLine());
			System.out.println("Insira o artista:");
			cd.setArtista(scanner.nextLine());
			System.out.println("Insira o numero de faixas:");
			cd.setFaixas(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Insira a duraçao:");
			cd.setDuracao(scanner.nextLine());
			System.out.println("Insira a descriçao:");
			cd.setDescricao(scanner.nextLine());
			

			cds.add(cd);
			break;
		}
		case "2": {
			System.out.println("Insira o titulo:");
			dvd.setTitulo(scanner.nextLine());
			System.out.println("Insira o diretor:");
			dvd.setDiretor(scanner.nextLine());
			System.out.println("Insira a duraçao:");
			dvd.setDuracao(scanner.nextLine());
			System.out.println("Insira classificaçao:");
			dvd.setClassificacao(scanner.nextLine());
			System.out.println("Insira o estudio:");
			dvd.setEstudio(scanner.nextLine());

			dvds.add(dvd);
			break;
		}
		case "3": {
			System.out.println("Insira a capacidade:");
			penDrive.setCapacidade(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Insira o tipo de conteudo:");
			penDrive.setConteudo(scanner.nextLine());
			penDrives.add(penDrive);
			scanner.nextLine();
		}
		default:
			System.err.println("Valor inesperado: ");
			registraMidias();
		}

		System.out.println("Insira 1 para continuar");
		if (scanner.nextLine().equals("1")) {
			registraMidias();
		} else {
			mostrarMidias();
		}
	}

	public static void mostrarMidias() {

		for (Cd cd : cds) {
			System.out.println("CD: " + cd.getTitulo());
			System.out.println("Artista: " + cd.getArtista());
			System.out.println("Numero de faixas: " + cd.getFaixas());
			System.out.println("Duraçao: " + cd.getDuracao());
			System.out.println("Descriçao: " + cd.getDescricao());
			System.out.println();
		}

		for (Dvd dvd : dvds) {
			System.out.println("DVD: " + dvd.getTitulo());
			System.out.println("Diretor: " + dvd.getDiretor());
			System.out.println("Duraçao: " + dvd.getDuracao());
			System.out.println("Classificaçao: " + dvd.getClassificacao());
			System.out.println("Estudio: " + dvd.getEstudio());
			System.out.println();
		}

		for (PenDrive penDrive : penDrives) {
			System.out.println("Pendrive ");
			System.out.println("Capacidade: " + penDrive.getCapacidade());
			System.out.println("Tipo de conteudo: " + penDrive.getConteudo());
			System.out.println();
		}

	}

}
