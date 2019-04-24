package br.edu.unievangelica.ftt.seintegra.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractcService<T> implements IService<T> {
	
	@Autowired
	private JpaRepository<T, Long> repository;
	
	@Override
	public List<T> findAll(){
		return repository.findAll();
	}
	
	public T findById (long id) {
		return repository.findById(id).get();
	}
	
	public T save(T object) {
		return repository.save(object);
	}
	
	public void deleteById(long id) {
		repository.deleteById(id);
	}
}
