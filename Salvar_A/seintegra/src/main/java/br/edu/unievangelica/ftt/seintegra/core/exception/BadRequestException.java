package br.edu.unievangelica.ftt.seintegra.core.exception;

import org.springframework.validation.Errors;

@SuppressWarnings("serial")
public class BadRequestException extends RuntimeException {
	private Errors errors;
	
	public BadRequestException(Errors erros) {
		this.errors= errors;
	}

	public Errors getErrors() {
		return errors;
	}

	public void setErrors(Errors errors) {
		this.errors = errors;
	}
	
	
}
