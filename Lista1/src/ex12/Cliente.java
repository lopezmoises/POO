package ex12;

/**
 * Cliente
 */
public class Cliente extends Pessoa {

    private int codigo;

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + getNome() + " - Data de nascimento:" + getNascimento() + " - Codigo:" + getCodigo());
    }

    /**
     * @return int return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}