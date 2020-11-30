package ex12;

import java.util.ArrayList;

/**
 * CadastroPessoas
 */
public class CadastroPessoas {

    private int qtdAtual;

    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void cadastrarPessoa(Pessoa pess) {
        pessoas.add(pess);
        qtdAtual += 1;
    }

    public void imprimeCadastro() {

        for (Pessoa p : pessoas) {
            p.imprimeDados();
        }
        System.out.println("Cantidade atual: " + getQtdAtual());
    }

    /**
     * @return int return the qtdAtual
     */
    public int getQtdAtual() {
        return qtdAtual;
    }

}