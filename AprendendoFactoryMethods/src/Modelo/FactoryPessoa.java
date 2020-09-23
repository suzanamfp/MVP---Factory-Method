package Modelo;

public class FactoryPessoa {
	
	
	public FactoryPessoa() {}
	
	public Pessoa getPessoa(String nome) {
		if (nome.equals ("Masculino")) {
			return new Masculino ("Masculino");
			
		}else if (nome.equals("Feminino")) {
			return new Feminino ("Feminino");
			
		}else if (nome.equals("SemGenero")) {
			return new SemGenero ("SemGenero");
		}
		else return null;
	}

}
