package ex1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FabricaLampada fabricaLampada = new FabricaLampada();

        System.out.println("Que tipo de lampada deseja constriur \nI- Incandescente \nF- Fluorescente");
        String l = scanner.nextLine();
        if (l.equals("I") || l.equals("F")) {
            Lampada lampada = fabricaLampada.construir(l);
            lampada.ligar();
            lampada.desligar();
        } else {
            System.out.println("Insira um valor valido");
        }

        scanner.close();

    }
}
