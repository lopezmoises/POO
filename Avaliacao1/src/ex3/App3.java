package ex3;

/**
 * App3
 */
public class App3 {

    public static void main(String[] args) {

        AeronaveComercial aeronaveComercial = new AeronaveComercial();
        aeronaveComercial.setPotenciaMotor(1000);
        aeronaveComercial.setAutonomia(200);
        aeronaveComercial.setOrigem("Madrid");
        aeronaveComercial.setDestino("Roma");
        aeronaveComercial.setNumeroMaxPassageiros(80);
        aeronaveComercial.setEconomica(50);
        aeronaveComercial.setExecutiva(30);

        aeronaveComercial.mostraAeronave();

        Produto produto = new Produto();
        produto.setNome("TV");
        produto.setPeso(100f);
        produto.setDestinatario("Shopping Canguru");

        AeronaveCarga aeronaveCarga = new AeronaveCarga();
        aeronaveCarga.setPotenciaMotor(2000);
        aeronaveCarga.setAutonomia(400);
        aeronaveCarga.setOrigem("China");
        aeronaveCarga.setDestino("Australia");
        aeronaveCarga.setCapacidade(10000);
        aeronaveCarga.setTipoProduto(produto);
        aeronaveCarga.mostraAeronave();
    }
}