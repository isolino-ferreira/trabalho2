package br.edu.ifes.sr.poo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.ifes.sr.poo2.model.MeuServicoImpl;
import br.edu.ifes.sr.poo2.service.JogoService;
import br.edu.ifes.sr.poo2.service.MeuServicoService;

@Controller
@RequestMapping("/meuservico")
public class MeuServicoController extends AbstractController{
	
	@Autowired
	private MeuServicoService service;
	
	@Autowired
	private JogoService serviceJogo;
	
	@RequestMapping(value = "/setIdServico/{idServico}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<MeuServicoImpl> setIdServico(@PathVariable Long idServico){
		
		try{
			
			MeuServicoImpl msi;
			
			if (service.count()!=0)
				msi = service.findAll().get(0);
			else
				msi = new MeuServicoImpl();
			
			msi.setIdServico(idServico.intValue());
			
			service.save(msi);
			
			return new ResponseEntity<MeuServicoImpl>(msi,
					HttpStatus.OK);
			
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<MeuServicoImpl>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/setIdGerente/{idGerente}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<MeuServicoImpl> setIdGerente(@PathVariable Long idGerente){
		
		try{
			
			MeuServicoImpl msi;
			
			if (service.count()!=0)
				msi = service.findAll().get(0);
			else
				msi = new MeuServicoImpl();
			
			msi.setIdGerente(idGerente.intValue());
			
			service.save(msi);
			
			return new ResponseEntity<MeuServicoImpl>(msi,
					HttpStatus.OK);
			
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<MeuServicoImpl>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/getIdGerente", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Long> getIdGerente(){
		
		try{
			
			MeuServicoImpl msi;
			
			if (service.count()!=0)
				msi = service.findAll().get(0);
			else
				msi = new MeuServicoImpl();

			
			return new ResponseEntity<Long>(new Long(msi.getIdGerente()),
					HttpStatus.OK);
			
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<Long>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/getIdServico", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Long> getIdServico(){
		
		try{
			
			MeuServicoImpl msi;
			
			if (service.count()!=0)
				msi = service.findAll().get(0);
			else
				msi = new MeuServicoImpl();

			
			return new ResponseEntity<Long>(new Long(msi.getIdServico()),
					HttpStatus.OK);
			
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<Long>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/ranking", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<String>> getRanking(){
		
		try{
			List<String> ranking = null;
			
			try { ranking = serviceJogo.listarPorUsernameCrescente(); } catch(Exception e){ e.printStackTrace();};
			
			return new ResponseEntity<List<String>>(ranking, HttpStatus.OK);
			
			
		}catch(Exception e){
			return new ResponseEntity<List<String>>(
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
