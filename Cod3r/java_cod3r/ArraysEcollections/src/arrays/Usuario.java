package arrays;

public class Usuario {
	String nome;
	String email;
	
	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	@Override
    public boolean equals(Object objeto) {
        if (this == objeto) // Verifica se é a mesma instância
            return true;
        if (objeto == null || getClass() != objeto.getClass()) // Verifica se o objeto é nulo  
            return false;
        Usuario other = (Usuario) objeto;
        return this.nome.equals(other.nome) && this.email.equals(other.email); // Compara os campos relevantes
    }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
