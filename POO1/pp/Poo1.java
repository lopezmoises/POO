package pp;

import java.util.Scanner;

public class Poo1 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        Imposto imposto = new Imposto();

        System.out.println("Escreva o nome");
        imposto.setNombre(input.nextLine());
        System.out.println("Escreva o cargo");
        imposto.setCargo(input.nextLine());
        System.out.println("Escreva o valor do salario");
        imposto.setSalario(input.nextFloat());

        System.out.println("O valor do imposto e: " + imposto.getSalario());
        input.close();
    }

}
