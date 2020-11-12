package ex1;

public class FabricaLampada {

    public Lampada construir(String tipoLampada) {

        if (tipoLampada.equals("I")) {
            Incandescente i = new Incandescente();
            return i;
        } else {
            Flourescente f = new Flourescente();
            return f;
        }
    }

    public class Incandescente implements Lampada {

        @Override
        public void ligar() {
            System.out.println("Ligada");

        }

        @Override
        public void desligar() {
            System.out.println("Desligada");

        }

    }

    public class Flourescente implements Lampada {

        @Override
        public void ligar() {
            System.out.println("Ligada");

        }

        @Override
        public void desligar() {
            System.out.println("Desligada");

        }

    }
}