package ex4;

import ex1.Animal;
import ex1.Cachorro;
import ex1.Cavalo;
import ex1.Preguica;

public class Zoologico {
    
    private Animal jaula[] = new Animal[10];


    public Zoologico() {

        jaula[0] = new Cachorro();
        jaula[1] = new Cavalo();
        jaula[2] = new Cachorro();
        jaula[3] = new Preguica();
        jaula[4] = new Cavalo();
        jaula[5] = new Cavalo();
        jaula[6] = new Cachorro();
        jaula[7] = new Preguica();
        jaula[8] = new Cavalo();
        jaula[9] = new Preguica();

        for (int i = 0; i < jaula.length; i++) {
            jaula[i].emitirSom();
            if(jaula[i].getClass() == Cachorro.class || jaula[i].getClass() == Cavalo.class ){
                jaula[i].correr();
            }
        }
    }
    
}
