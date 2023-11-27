package ecommerce.model;

public abstract class Cafe {
	
	private String nomeCafe;
	private String nomeAcessorio;
	private float valor;
	
	public Cafe(String nomeCafe, String nomeAcessorio, float valor) {
		this.nomeCafe = nomeCafe;
		this.nomeAcessorio = nomeAcessorio;
		this.valor = valor;
	}

	public String getNomeCafe() {
		return nomeCafe;
	}

	public void setNomeCafe(String nomeCafe) {
		this.nomeCafe = nomeCafe;
	}

	public String getNomeAcessorio() {
		return nomeAcessorio;
	}

	public void setNomeAcessorio(String nomeAcessorio) {
		this.nomeAcessorio = nomeAcessorio;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	

}
