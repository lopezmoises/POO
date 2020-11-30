package ex12;

import java.util.Date;

/**
 * TestaCadastro
 */
public class TestaCadastro {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Mario Neta");
        cliente.setNascimento(new Date(657456906000L));
        cliente.setCodigo(1);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Elba Gallo");
        funcionario.setNascimento(new Date(379309200000L));
        funcionario.setSalario(18000F);

        Gerente gerente = new Gerente();
        gerente.setNome("Caio Rolando da Rocha");
        gerente.setNascimento(new Date(174533642000L));
        gerente.setSalario(23000F);
        gerente.setArea("Vendas");

        CadastroPessoas cadastroPessoas = new CadastroPessoas();
        cadastroPessoas.cadastrarPessoa(cliente);
        cadastroPessoas.cadastrarPessoa(funcionario);
        cadastroPessoas.cadastrarPessoa(gerente);

        cadastroPessoas.imprimeCadastro();
    }
}