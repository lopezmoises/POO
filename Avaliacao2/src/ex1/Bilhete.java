package ex1;

import java.time.*;
import java.util.Random;

public class Bilhete {

    private int quantidade;
    private final Random random = new Random();

    public void comprarBilhete(String evento, int quantidade) {
        switch (evento) {
            case "partidaFutebol":
                setQuantidade(quantidade);
                System.out.println();
                System.out.println("Quantidade de ingresos comprada: " + getQuantidade() + "\n" + bilhetePartidaFutebol() + "\n-----------------------------------\n" );
                break;
            case "showMusica":
                setQuantidade(quantidade);
                System.out.println("Quantidade de ingresos comprada: " + getQuantidade() + "\n" + bilheteShowMusica() + "\n-----------------------------------\n" );
                break;
            case "cinema":
                setQuantidade(quantidade);
                System.out.println("Quantidade de ingresos comprada: " + getQuantidade() + "\n" + bilheteCinema() + "\n-----------------------------------\n" );
                break;
            default:
                System.err.println("Selecione um evento valido");
                break;
        }
    }

    private String bilhetePartidaFutebol() {

        Evento evento = new Evento();
        PartidaFutebol partidaFutebol = new PartidaFutebol();
        String[] times = { "Real Madrid", "Manchester United" };

        partidaFutebol.setId(1);
        partidaFutebol.setNroCadeira(random.nextInt(80000) + 1);
        partidaFutebol.setTimes(times);
        partidaFutebol.setValor(400);

        evento.setTipoEvento(partidaFutebol);
        evento.setNomeEvento("Final Champions League");
        evento.setData(LocalDate.of(2021, 06, 20));
        evento.setLimitePublico(80000);
        evento.toString();

        return evento.toString();
    }

    private String bilheteShowMusica() {

        Evento evento = new Evento();
        ShowMusica showMusica = new ShowMusica();
        String[] tipoIngreso = { "Camarote", "Cadeira", "Gramado" };

        showMusica.setId(1);
        showMusica.setArtista("Metallica");
        showMusica.setTipoIngreso(tipoIngreso[random.nextInt(tipoIngreso.length)]);
        showMusica.setValor(1000);

        evento.setTipoEvento(showMusica);
        evento.setNomeEvento("Tour Metallica");
        evento.setData(LocalDate.of(2021, 03, 10));
        evento.setLimitePublico(30000);
        evento.toString();

        return evento.toString();
    }

    private String bilheteCinema() {

        Evento evento = new Evento();
        Cinema cinema = new Cinema();

        cinema.setId(1);
        cinema.setFilme("Avengers");
        cinema.setNroPoltrona(random.nextInt(100) + 1);
        cinema.setValor(35);

        evento.setTipoEvento(cinema);
        evento.setNomeEvento("Estreia Avengers");
        evento.setData(LocalDate.of(2021, 02, 15));
        evento.setLimitePublico(100);
        evento.toString();

        return evento.toString();
    }

    /**
     * @return int return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
