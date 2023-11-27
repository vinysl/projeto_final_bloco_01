package ecommerce.model;

public class CafeMoido extends Cafe {

	private String intenso;
	private String classico;
	private String organico;
	
	public CafeMoido(String nomeCafe, int tipoCafe, float valor) {
		super(nomeCafe, tipoCafe, valor);
		
	}

	public String getIntenso() {
		return intenso;
	}

	public void setIntenso(String intenso) {
		this.intenso = intenso;
	}

	public String getClassico() {
		return classico;
	}

	public void setClassico(String classico) {
		this.classico = classico;
	}

	public String getOrganico() {
		return organico;
	}

	public void setOrganico(String organico) {
		this.organico = organico;
	}

}
