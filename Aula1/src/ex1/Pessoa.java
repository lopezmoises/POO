package ex1;

public class Pessoa {

	private Long Id;

	private String Nome;

	private String Email;

	private String Telefone;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public void exibeDados() {
		System.out.println("Dados da pessoa: \n");
		System.out.println("Nome: " + getNome());
		System.out.println("Email: " + getEmail());
		System.out.println("Telefone: " + getTelefone());
	}
}
