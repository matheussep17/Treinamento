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
@RequestMapping("/api/produto")

public class ProductController {
private List<String> produtos = new ArrayList<>(Arrays.asList("Produto 1", "Produto 2", "Produto 3"));
	
	@GetMapping
	public List<String> findAll() {
		return produtos;
	}
	
	@GetMapping("{index}")
	public String findByIndex(@PathVariable int index) {
		return produtos.get(index);
	}
	
	@DeleteMapping("{index}")
	public boolean delete(@PathVariable int index) {
		produtos.remove(index);
		return true;
	}
	
	@PostMapping("{nome}")
	public boolean save(@PathVariable String nome) {
		produtos.add(nome);
		return true;
	}
	
	@PutMapping("{index}/{nome}")
	public boolean update(@PathVariable int index, @PathVariable String nome) {
		produtos.remove(index);
		produtos.add(nome);
		return true;
	}
}