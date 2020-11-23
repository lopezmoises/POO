package ex1;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Latir");
    }

    public void correr(){
        System.out.println("Correndo");
    }

}