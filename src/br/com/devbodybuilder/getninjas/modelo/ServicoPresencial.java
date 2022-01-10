package br.com.devbodybuilder.getninjas.modelo;

public abstract class ServicoPresencial extends Servico {

	public ServicoPresencial(String data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	private String local;
}
