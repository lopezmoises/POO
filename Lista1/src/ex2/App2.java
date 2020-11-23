package ex2;
import ex1.*;

public class App2 {
 
    public static void main(String[] args) {
        
        Animal cavalo = new Cavalo();
        cavalo.emitirSom();

        Animal cachorro = new Cachorro();
        cachorro.emitirSom();

        Animal preguica = new Preguica();
        preguica.emitirSom();
    }
}