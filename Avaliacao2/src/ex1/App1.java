package ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * App1
 */
public class App1 {

    public static void main(String[] args) {
        CompraBilhete compraBilhete = new CompraBilhete();

        ExecutorService threadEcecutor = Executors.newCachedThreadPool();

        threadEcecutor.execute(compraBilhete);
        threadEcecutor.execute(compraBilhete);
        threadEcecutor.execute(compraBilhete);
        threadEcecutor.execute(compraBilhete);
        threadEcecutor.execute(compraBilhete);

        threadEcecutor.shutdown();
    }

}