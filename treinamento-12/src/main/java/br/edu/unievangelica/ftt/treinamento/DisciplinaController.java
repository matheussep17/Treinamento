package br.edu.unievangelica.ftt.treinamento;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/disciplina")
public class DisciplinaController {

	private List<Disciplina> disciplinas = new ArrayList<>();

	@GetMapping
	public List<Disciplina> findAll(){
		return disciplinas;
	}
	
	@GetMapping ("{index}")
	public Disciplina findByIndex (@PathVariable int index) {
		return disciplinas.get(index);
	}
	@PostMapping
	public Disciplina save (@RequestBody Disciplina disciplina) {
		disciplinas.add(disciplina);
		return disciplina;
	}

	@DeleteMapping ("{index}")
	public ResponseEntity<String> delete(@PathVariable int index){
		disciplinas.remove(index);
		return  new ResponseEntity<>(HttpStatus.OK);
	}
}
