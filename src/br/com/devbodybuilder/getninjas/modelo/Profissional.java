package br.com.devbodybuilder.getninjas.modelo;

public class Profissional {
	
	private String cep;
	private String nome;
	private String email;
	private String celular;
	
	public Profissional(String cep, String email, String celular) {
		Validator validator = new Validator();
		
		if (validator.cepEhValido(cep) == false) {
			throw new CepInvalidoException ("CEP inserido é inválido");
		} else {
			this.setCep(cep);
		}
		
		if (validator.emailEhValido(email) == false) {
			throw new EmailInvalidoException ("Email inserido é inválido");
		} else {
			this.setEmail(email);
		}
		
		if (validator.celularEhValido(celular) == false) {
			throw new NumeroInvalidoException ("Numero inserido é inválido");
		} else {
			this.setCelular(celular);
		}
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
}
