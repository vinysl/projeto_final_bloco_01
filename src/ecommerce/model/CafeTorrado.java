package ecommerce.model;

public class CafeTorrado extends Cafe {

	private int tipo;
	
	public CafeTorrado(String nomeCafe, String nomeAcessorio, float valor, int tipo) {
		super(nomeCafe, nomeAcessorio, valor);
		this.tipo = tipo;
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
