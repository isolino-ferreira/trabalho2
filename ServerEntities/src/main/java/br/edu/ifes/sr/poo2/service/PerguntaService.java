package br.edu.ifes.sr.poo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifes.sr.poo2.model.NivelTerceiro;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;
import br.edu.ifes.sr.poo2.repository.JogoRepository;
import br.edu.ifes.sr.poo2.repository.PerguntaRepository;
import br.edu.ifes.sr.poo2.service.generic.CRUDGenerics;

@Service
public class PerguntaService implements CRUDGenerics<PerguntaImpl> {

	@Autowired
	PerguntaRepository repos;	
	
	@Autowired
	JogoRepository reposJogo;
	
	@Override
	public void save(PerguntaImpl t) {
		// TODO Auto-generated method stub
		
		repos.save(t);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		repos.delete(id);
	}

	@Override
	public PerguntaImpl find(long id) {
		// TODO Auto-generated method stub
		return repos.findById(id);
	}

	@Override
	public List<PerguntaImpl> findAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}
	
	public List<PerguntaImpl> findByNivel(NivelTerceiro nivel){
		return repos.findByNivel(nivel);
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		repos.deleteAll();
	}
	public void save(List<PerguntaImpl> perguntas){
		repos.save(perguntas);
	}	
	

}
