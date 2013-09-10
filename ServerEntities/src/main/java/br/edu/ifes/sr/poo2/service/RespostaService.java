package br.edu.ifes.sr.poo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifes.sr.poo2.model.RespostaImpl;
import br.edu.ifes.sr.poo2.repository.RespostaRepository;
import br.edu.ifes.sr.poo2.service.generic.CRUDGenerics;

@Service
public class RespostaService implements CRUDGenerics<RespostaImpl> {
	
	@Autowired
	RespostaRepository repos;

	@Override
	public void save(RespostaImpl t) {
		// TODO Auto-generated method stub
		repos.save(t);
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		repos.delete(id);
	}

	@Override
	public RespostaImpl find(long id) {
		// TODO Auto-generated method stub
		return repos.findOne(id);
	}

	@Override
	public List<RespostaImpl> findAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		repos.deleteAll();
	}
	
	public int count(){
		return (int)repos.count();
	}

}
