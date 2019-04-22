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
@RequestMapping("/api/curso")
public class CursoController {
	
	private List<Curso> cursos = new ArrayList<>();

	@GetMapping
	public List<Curso> findAll(){
		return cursos;
	}
	
	@GetMapping ("{index}")
	public Curso findByIndex (@PathVariable int index) {
		return cursos.get(index);
	}
	@PostMapping
	public Curso save (@RequestBody Curso curso) {
		cursos.add(curso);
		return curso;
	}

	@DeleteMapping ("{index}")
	public ResponseEntity<String> delete(@PathVariable int index){
		cursos.remove(index);
		return  new ResponseEntity<>(HttpStatus.OK);
	}
}