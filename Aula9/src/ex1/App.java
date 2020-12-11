package ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) throws Exception {
        
        Multithread thread1 = new Multithread(1, 1000);
        Multithread thread2 = new Multithread(1000, 2000);
        Multithread thread3 = new Multithread(2000, 3000);
        Multithread thread4 = new Multithread(3000, 4000);
        Multithread thread5 = new Multithread(4000, 5000);
        Multithread thread6 = new Multithread(5000, 6000);
        Multithread thread7 = new Multithread(6000, 7000);
        Multithread thread8 = new Multithread(7000, 8000);
        Multithread thread9 = new Multithread(8000, 9000);

        ExecutorService threadEcecutor = Executors.newCachedThreadPool();

        threadEcecutor.execute(thread1);
        threadEcecutor.execute(thread2);
        threadEcecutor.execute(thread3);
        threadEcecutor.execute(thread4);
        threadEcecutor.execute(thread5);
        threadEcecutor.execute(thread6);
        threadEcecutor.execute(thread7);
        threadEcecutor.execute(thread8);
        threadEcecutor.execute(thread9);

        threadEcecutor.shutdown();
    }

}
