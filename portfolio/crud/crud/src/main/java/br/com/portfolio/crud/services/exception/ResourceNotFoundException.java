package br.com.portfolio.crud.services.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Não localizamos um usuário com a id" + id);
		
	}
	
	

}
