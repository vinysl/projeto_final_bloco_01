package ecommerce.model;

public abstract class Cafe {
	
	private String nomeCafe;
	private int tipoCafe;
	private float valor;
	
	
	public Cafe(String nomeCafe, int tipoCafe, float valor) {
		this.nomeCafe = nomeCafe;
		this.tipoCafe = tipoCafe;
		this.valor = valor;
	}


	public String getNomeCafe() {
		return nomeCafe;
	}


	public void setNomeCafe(String nomeCafe) {
		this.nomeCafe = nomeCafe;
	}


	public int getTipoCafe() {
		return tipoCafe;
	}


	public void setTipoCafe(int tipoCafe) {
		this.tipoCafe = tipoCafe;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}

}
