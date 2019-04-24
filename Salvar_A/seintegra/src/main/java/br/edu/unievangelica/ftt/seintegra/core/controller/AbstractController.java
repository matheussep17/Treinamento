package br.edu.unievangelica.ftt.seintegra.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.unievangelica.ftt.seintegra.core.service.IService;

public abstract class AbstractController<T> extends ResponseAbstractController implements IController<T> {
	
	@Autowired
	private IService<T> service;
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		return jsonResponse(service.findAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable long id){
		return jsonResponse(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody T object){
		return jsonResponse(service.save(object));
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody T object){
		return jsonResponse(service.save(object));
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteById(@PathVariable long id){
		service.deleteById(id);
		return jsonResponse();
	}
	
	}