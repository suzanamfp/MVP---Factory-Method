package Modelo;

public class Cliente {
	
	public static void main (String [] args) {
		
		FactoryPessoa fabricaPessoa = new FactoryPessoa();
		Pessoa pessoa = fabricaPessoa.getPessoa("SemGenero");
		pessoa.setNome("Pedro");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.identificarGenero());
		
		
	}

}
