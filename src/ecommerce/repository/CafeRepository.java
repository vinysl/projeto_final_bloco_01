package ecommerce.repository;

import ecommerce.model.Cafe;

public interface CafeRepository {
	
	public void cadastrar(Cafe cafe);
	public void listar();
	public void buscar(String nomeCafe);
	public void atualizar(Cafe cafe);
	public void apagar(String nomeCafe);
	
	
	public void comprarCafe(String nomeCafe, float valor);
	public void comprarAcessório(String nomeAcessorio, float valor);

}
