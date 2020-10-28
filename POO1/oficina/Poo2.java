package oficina;

import java.util.ArrayList;

public class Poo2 {

    public static void main(String[] args) {
        
                
        Carro c = new Carro();
        Carro d = new Carro();
        
        c.setChassi("1234");
        c.setCor("Preto");
        c.setDefeito("Roda quebrada");
        c.setPlaca("ABC-0001");
        c.adicionaVeiculo(c);
        
        d.setChassi("5678");
        d.setCor("Branco");
        d.setDefeito("Problema no motor");
        d.setPlaca("ABC-0002");
        c.adicionaVeiculo(d);
        
        ArrayList<Carro> listaCarros = c.listaVeiculos();
        for (int i = 0; i < listaCarros.size(); i++) {
            System.out.println("Placa-> "+listaCarros.get(i).getPlaca());
            System.out.println("Chassi-> "+listaCarros.get(i).getChassi());
            System.out.println("Cor-> "+listaCarros.get(i).getCor());
            System.out.println("Defeito-> "+listaCarros.get(i).getDefeito());
            System.out.println("\n\n---------------------------\n\n");
        }

    }
}