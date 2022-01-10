package br.com.devbodybuilder.getninjas.modelo;

public class CepInvalidoException extends RuntimeException {

	public CepInvalidoException(String mensagemErro) {
		super(mensagemErro);
	}
}
