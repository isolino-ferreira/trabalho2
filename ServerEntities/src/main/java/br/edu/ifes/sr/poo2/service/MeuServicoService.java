package br.edu.ifes.sr.poo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifes.sr.poo2.model.MeuServicoImpl;
import br.edu.ifes.sr.poo2.repository.MeuServicoRepository;
import br.edu.ifes.sr.poo2.service.generic.CRUDGenerics;

@Service
public class MeuServicoService implements CRUDGenerics<MeuServicoImpl> {
	
	@Autowired
	MeuServicoRepository repos;

	@Override
	public void save(MeuServicoImpl t) {
		// TODO Auto-generated method stub
		repos.save(t);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		repos.delete(id);
		
	}

	@Override
	public MeuServicoImpl find(long id) {
		// TODO Auto-generated method stub
		return repos.findById(id);
	}

	@Override
	public List<MeuServicoImpl> findAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}
	
	public void deleteAll(){
		repos.deleteAll();
	}
	
	public int count(){
		return (int)repos.count();
	}


}
