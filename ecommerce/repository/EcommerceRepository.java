package ecommerce.repository;

import ecommerce.model.Cafe;

public interface EcommerceRepository {
	
	public void buscarCafe(String nomeCafe);
	public void listarTodos();
	public void cadastrar(Cafe cafe);
	public void atualizar(Cafe cafe);
	public void apagar(Cafe cafe);
	
	
	public void comprarCafe(String cafe, float valor);
	public void comprarAcessorio(String acessorio, float valor);
	
	

}
