package ex2;

import java.util.Random;

/**
 * Lebre
 */
public class Lebre implements Runnable {

    private String nome;
    private int distancia;
    private final Random generator = new Random();
    private final Random random = new Random();
    private int pulo = 0;
    private int numeroPulo = 0;

    public Lebre(String nome, int distancia) {
        this.nome = nome;
        this.distancia = distancia;
    }

    @Override
    public void run() {

        do {
            int salto = random.nextInt((3 - 1) + 1) + 1;
            pulo += salto;

            System.out.println("Lebre " + nome + " - Pulou " + salto + " metros ");
            try {
                Thread.sleep(generator.nextInt(5000));
            } catch (InterruptedException e) {
                System.err.println("Terminou prematuramente");
            }

            numeroPulo++;
        } while (pulo < distancia);
        System.out.println("-------Lebre " + nome + " terminou a corrida-------Qtd. de pulos: " + numeroPulo);
    }

}