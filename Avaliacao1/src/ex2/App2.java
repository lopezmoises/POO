package ex2;

/**
 * App2
 */
public class App2 {

    public static void main(String[] args) {

        Elevator elevator = new Elevator(1000, 12, 20);

        elevator.entraPessoa(85);
        elevator.entraPessoa(55);
        System.out.println(elevator.toString());

        elevator.sobeAndar();
        elevator.sobeAndar();
        elevator.sobeAndar();
        elevator.sobeAndar();
        elevator.sobeAndar();
        System.out.println(elevator.toString());

        elevator.entraPessoa(105);
        elevator.entraPessoa(70);
        elevator.saiPessoa(80);
        System.out.println(elevator.toString());

        elevator.sobeAndar();
        elevator.sobeAndar();
        elevator.sobeAndar();
        elevator.sobeAndar();
        System.out.println(elevator.toString());

        elevator.entraPessoa(85);
        elevator.saiPessoa(85);
        System.out.println(elevator.toString());

        elevator.desceAndar();
        elevator.desceAndar();
        elevator.desceAndar();
        System.out.println(elevator.toString());

        elevator.saiPessoa(110);
        System.out.println(elevator.toString());

        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        elevator.entraPessoa(110);
        System.out.println(elevator.toString());
    }
}