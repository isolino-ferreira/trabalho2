package br.edu.ifes.sr.poo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifes.sr.poo2.model.MeuServicoImpl;

public interface MeuServicoRepository extends
		JpaRepository<MeuServicoImpl, Long> {
	
	MeuServicoImpl findById(Long id);

}
