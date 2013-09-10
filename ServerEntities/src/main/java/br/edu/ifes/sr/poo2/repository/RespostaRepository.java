package br.edu.ifes.sr.poo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifes.sr.poo2.model.RespostaImpl;

public interface RespostaRepository extends JpaRepository<RespostaImpl, Long> {
	
	RespostaImpl findById(Long id);

}
