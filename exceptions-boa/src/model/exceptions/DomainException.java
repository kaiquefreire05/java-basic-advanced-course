package model.exceptions;

public class DomainException extends Exception{
	// Exception, você é obrigado a tratar
	// parseExecption, você não é obrigado a tratar
	private static final long serialVersionUID = 1L;
	
	// construtores
	public DomainException(String msg) {
		super(msg);
	}
}
