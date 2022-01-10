package br.com.devbodybuilder.getninjas.modelo;

public class EmailInvalidoException extends RuntimeException {

	public EmailInvalidoException(String mensagemErro) {
		super(mensagemErro);
	}
}
