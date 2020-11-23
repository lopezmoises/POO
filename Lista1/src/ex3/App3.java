package ex3;

import ex1.*;

public class App3 {
    
    public static void main(String[] args) {
        
        Veterinario veterinario = new Veterinario();
        Animal cachorro = new Cachorro();
        Animal cavalo = new Cavalo();
        Animal preguica = new Preguica();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
