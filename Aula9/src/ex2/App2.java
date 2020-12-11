package ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 {
    
    public static void main(String[] args) {
        

        Cavalo cavaloBranco = new Cavalo("Branco");
        Cavalo cavaloMarrom = new Cavalo("Marrom");
        Cavalo cavaloPreto = new Cavalo("Preto");

        ExecutorService threadEcecutor = Executors.newCachedThreadPool();

        threadEcecutor.execute(cavaloBranco);
        threadEcecutor.execute(cavaloMarrom);
        threadEcecutor.execute(cavaloPreto);

        threadEcecutor.shutdown();
        
    }
}
