package br.edu.ifes.sr.poo2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.edu.ifes.sr.poo2.model.NivelTerceiro;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;

@Repository
@Transactional
public interface PerguntaRepository extends JpaRepository<PerguntaImpl, Long> {
	
	PerguntaImpl findById(Long id);
	
	List<PerguntaImpl> findByNivel(NivelTerceiro nivel);

}
