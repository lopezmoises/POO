package ex1;

import java.util.Random;

public class CompraBilhete implements Runnable {

    private final Random random = new Random();
    private Bilhete bilhete = new Bilhete();
    private String[] evento = { "partidaFutebol", "showMusica", "cinema" };

    @Override
    public void run() {
        
        bilhete.comprarBilhete(evento[random.nextInt(evento.length)], random.nextInt(200));

    }

    
}
