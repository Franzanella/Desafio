package exercicio2;

public class Pessoa {
	String nome;
	String endereco;
	int telefone;
	
	public Pessoa() {
	}

	
	 public void imprimir() {
         System.out.println("Nome: " + nome);
         System.out.println("Endereco: " + endereco);
         System.out.println("Telefone: " + telefone);
        

   }
	
	public String getNome() {
        return nome;
    }
	
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}

