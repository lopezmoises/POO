package ex1;

public class Cavalo extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Relinchar");
    }
    
    public void correr(){
        System.out.println("Correndo");
    }

}