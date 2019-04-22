package br.edu.unievangelica.ftt.seintegra.domain.mantenedora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unievangelica.ftt.seintegra.core.controller.IController;
import br.edu.unievangelica.ftt.seintegra.core.controller.ResponseAbstractController;

@RestController
@RequestMapping("/api/mantenedora")
public class MantenedoraController extends ResponseAbstractController implements IController<Mantenedora>{

	@Autowired
	private MantenedoraService mantenedoraService;
	
	@Override
	@GetMapping
	public ResponseEntity<?> findAll() {
		return jsonResponse(mantenedoraService.findAll());
	}

	@Override
	@GetMapping("{id}")
	public ResponseEntity<?> findById(@PathVariable long id) {
		return jsonResponse (mantenedoraService.findById(id));
	}

	@Override
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Mantenedora object) {
		return jsonResponse(mantenedoraService.save(object));
	}

	@Override
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Mantenedora object) {
		return jsonResponse(mantenedoraService.save(object));
	}

	@Override
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteById(@PathVariable long id) {
		mantenedoraService.deleteById(id);
		return jsonResponse(null);
	}

}