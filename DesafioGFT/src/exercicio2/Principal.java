package exercicio2;

public class Principal extends Pessoa{

	public static void main(String[] args) {
		
		
		 Pessoa p1 = new Pessoa();
         p1.setNome("Franciele Zanella");
         p1.setEndereco("Rua Piquerobi");
         p1.setTelefone(34674423);
         
         
        p1.imprimir();
        System.out.println("======================================");
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Maria da Silva");
        p2.setEndereco("Rua das Laranjeiras");
        p2.setTelefone(34558877);

        p2.imprimir();
		

	}

}
