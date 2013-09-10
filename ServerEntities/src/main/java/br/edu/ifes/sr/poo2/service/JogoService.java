package br.edu.ifes.sr.poo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifes.sr.poo2.model.JogoImpl;
import br.edu.ifes.sr.poo2.repository.JogoRepository;
import br.edu.ifes.sr.poo2.service.generic.CRUDGenerics;

@Service
public class JogoService implements CRUDGenerics<JogoImpl> {

	@Autowired
	private JogoRepository repos;
	
	@Override
	public void save(JogoImpl t) {
		// TODO Auto-generated method stub
		repos.save(t);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		repos.delete(id);
	}

	@Override
	public JogoImpl find(long id) {
		// TODO Auto-generated method stub
		return repos.findById(id);
	}

	@Override
	public List<JogoImpl> findAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}
	
	public List<String> listarPorUsernameCrescente(){
		return repos.findByAllOrderByUsername();
	}

}
