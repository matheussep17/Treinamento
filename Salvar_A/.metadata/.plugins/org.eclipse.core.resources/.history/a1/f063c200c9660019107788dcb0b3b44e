package br.edu.unievangelica.ftt.seintegra.core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface IController<T> {

		ResponseEntity<?> findAll();
		
		ResponseEntity<?> findById(@PathVariable long id);
		
		ResponseEntity<?> save(@RequestBody T object);
		
		ResponseEntity<?> update(@RequestBody T object);
		
		ResponseEntity<?> deleteById(@PathVariable long id);
		
		
}
