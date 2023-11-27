package ecommerce.model;

public class CafeMoido extends Cafe {

	private int tipo;
	
	public CafeMoido(String nomeCafe, String nomeAcessorio, float valor, int tipo) {
		super(nomeCafe, nomeAcessorio, valor);
		this.setTipo(tipo);
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
