package ex2;

import java.util.Random;

public class Cavalo implements Runnable {
    private String nome;
    private final Random generator = new Random();

    public Cavalo(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 30; i++) {
            System.out.println("Cavalo " + nome + " - Movimento " + i);

            try {
                Thread.sleep(generator.nextInt(3000));
            } catch (InterruptedException e) {
                System.err.println("Terminou prematuramente");
            }

        }
        System.out.println("-----------------Cavalo " + nome + " terminou a corrida-----------------");
    }

}
