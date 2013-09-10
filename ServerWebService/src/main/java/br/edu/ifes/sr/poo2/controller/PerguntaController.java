package br.edu.ifes.sr.poo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.edu.ifes.sr.poo2.api.model.Pergunta;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;
import br.edu.ifes.sr.poo2.service.PerguntaService;
import br.edu.ifes.sr.poo2.util.ConversorPergunta;
import br.edu.ifes.sr.poo2.util.GerarListaPerguntasRespostas;

@Controller
@RequestMapping("/pergunta")
public class PerguntaController extends AbstractController {
	
	@Autowired
	private PerguntaService service;
	
	@RequestMapping(value = "/add/", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<String> add(@RequestBody PerguntaImpl pergunta) {
		
		try{
			
			service.save(pergunta);
			
			String id = pergunta.getId().toString();
			
			return new ResponseEntity<String>(id,
					HttpStatus.OK);
			
		}catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> delete(@PathVariable Long id){
		try{
			service.delete(id);
			return new ResponseEntity<String>("Pergunta deletada",
					HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/deleteall", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> delete(){
		try{
			service.deleteAll();
			return new ResponseEntity<String>("Todas as perguntas e respostas foram deletadas",
					HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Pergunta>> getAll(){
		try{
			
			List<PerguntaImpl> perguntas = service.findAll();
			
			List<Pergunta> perg = null;
			
			if (perguntas != null) {
				
				perg = ConversorPergunta.toPergunta(perguntas);
				
			}
			return new ResponseEntity<List<Pergunta>>(perg,HttpStatus.OK);
			
		}catch(Exception e){
			return new ResponseEntity<List<Pergunta>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Pergunta> get(@PathVariable Long id){
		try{
			
			PerguntaImpl pergunta = (PerguntaImpl) service.find(id);
			
			Pergunta perg = null;
			
			if (pergunta != null){
				
				perg = ConversorPergunta.toPergunta(pergunta);
				
			}
			
			return new ResponseEntity<Pergunta>(perg, HttpStatus.OK);
			
		}catch(Exception e){
			return new ResponseEntity<Pergunta>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@RequestMapping(value = "/gerar", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> gerar(){
		try{
			List<PerguntaImpl> perguntas = GerarListaPerguntasRespostas.carregar();
			service.deleteAll();
			
			service.save(perguntas);
			
			return new ResponseEntity<String>("Deletando todas as perguntas e gerando todas perguntas",
					HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
