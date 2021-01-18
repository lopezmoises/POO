package ex2;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a distancia da corrida");
        int distancia = scanner.nextInt();

        Lebre branca = new Lebre("Branca", distancia);
        Lebre preta = new Lebre("Preta", distancia);
        Lebre cinza = new Lebre("Cinza", distancia);
        Lebre amarela = new Lebre("Amarela", distancia);
        Lebre marrom = new Lebre("Marrom", distancia);

        ExecutorService threadEcecutor = Executors.newCachedThreadPool();

        threadEcecutor.execute(branca);
        threadEcecutor.execute(preta);
        threadEcecutor.execute(cinza);
        threadEcecutor.execute(amarela);
        threadEcecutor.execute(marrom);

        threadEcecutor.shutdown();

        scanner.close();
    }
}
