package br.com.devbodybuilder.getninjas.modelo;

public abstract class Servico {
	
	private String data;
	private double valor;
	private double duracao;
	private double prazoEmDias;
	
	public Servico(String data) {
		Validator validator = new Validator();
		
		if (validator.dataEhValida(data) == false) {
			throw new RuntimeException ("Data inserida é inválida");
		} else {
			this.data = data;
		}
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public double getPrazoEmDias() {
		return prazoEmDias;
	}

	public void setPrazoEmDias(double prazoEmDias) {
		this.prazoEmDias = prazoEmDias;
	}
	
}
