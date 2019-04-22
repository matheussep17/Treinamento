package br.edu.unievangelica.ftt.seintegra.domain.curso;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
	
	public List<Curso> findByNome(String nome);
	
	@Query("from Curso where nome like concat('%', ?1, '%')")
	public List<Curso> findByNomeLike(String nome);
	
	
}