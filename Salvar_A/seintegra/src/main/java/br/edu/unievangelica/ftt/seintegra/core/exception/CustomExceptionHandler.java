package br.edu.unievangelica.ftt.seintegra.core.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {
	/* BAD REQUEST - 400*/
	@ExceptionHandler ({BadRequestException.class})
	public ResponseEntity<?> handlerBadRequestException (BadRequestException e){
		
		
		List<FieldError> fieldErrors = new ArrayList<>();
		e.getErrors().getFieldErrors().forEach(error ->fieldErrors.add(new FieldError(error.getField(), error.getDefaultMessage(), error.getCode())) );
		
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	
	
	/* Not Found - 404*/
	@ExceptionHandler ({NotFoundException.class})
	public ResponseEntity<?> handlerNotFoundException(NotFoundException e){
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
