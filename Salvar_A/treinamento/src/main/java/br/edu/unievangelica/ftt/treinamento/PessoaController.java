package br.edu.unievangelica.ftt.treinamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {
	
	private List<String> pessoas = new ArrayList<>(Arrays.asList("Douglas", "Paulo", "Robertinho"));
	
	@GetMapping
	public List<String> findAll() {
		return pessoas;
	}
	
	@GetMapping("{index}")
	public ResponseEntity<String> findByIndex(@PathVariable int index) {
		try {
			return new ResponseEntity<>(pessoas.get(index), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Pessoa não encontrada", HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("{index}")
	public boolean delete(@PathVariable int index) {
		System.out.print(index);
		pessoas.remove(index);
		return true;
	}
	
	@PostMapping("{nome}")
	public boolean save(@PathVariable String nome) {
		pessoas.add(nome);
		return true;
	}
	
	@PutMapping("{index}/{nome}")
	public boolean update(@PathVariable int index, @PathVariable String nome) {
		pessoas.remove(index);
		pessoas.add(nome);
		return true;
	}
}