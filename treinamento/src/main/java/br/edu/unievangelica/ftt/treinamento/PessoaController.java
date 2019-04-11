package br.edu.unievangelica.ftt.treinamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	public String findByIndex(@PathVariable int index) {
		return pessoas.get(index);
	}
	
	@DeleteMapping("{index}")
	public boolean delete(@PathVariable int index) {
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