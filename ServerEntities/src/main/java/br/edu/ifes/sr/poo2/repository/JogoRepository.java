package br.edu.ifes.sr.poo2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifes.sr.poo2.model.JogoImpl;

@Repository
@Transactional
public interface JogoRepository extends JpaRepository<JogoImpl, Long> {
	
	JogoImpl findById(Long id);
	
	
	@Query("SELECT username , SUM(pontos) as pontos FROM JogoImpl j GROUP BY username ORDER BY pontos desc")
	List<String> findByAllOrderByUsername();

}
