package ex1;

public class Multithread implements Runnable {

    private int comeco;
    private int fim;

    public Multithread(int comeco, int fim) {
        this.comeco = comeco;
        this.fim = fim;
    }

    @Override
    public void run() {
        
        int x, contador;
        
        for (int i = comeco; i < fim; i++) {
            x = 1;
            contador = 0;
            while (x <= i) {
                if (i % x == 0) {
                    contador += 1;
                }
                x++;
            }
            if (contador == 2) {
                System.out.print(i + "\t");
            }
        }
    }

}
