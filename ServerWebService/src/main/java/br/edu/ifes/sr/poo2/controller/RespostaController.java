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

import br.edu.ifes.sr.poo2.model.RespostaImpl;
import br.edu.ifes.sr.poo2.service.RespostaService;

@Controller
@RequestMapping("/resposta")
public class RespostaController extends AbstractController {

		
		@Autowired
		private RespostaService service;
		
		@RequestMapping(value = "/add/", method = RequestMethod.POST)
		@ResponseBody
		public ResponseEntity<String> add(@RequestBody RespostaImpl resposta) {
			
			try{
				
				service.save(resposta);
				return new ResponseEntity<String>(resposta.getId().toString(),
						HttpStatus.OK);
				
			}catch(Exception e){
				e.printStackTrace();
				return new ResponseEntity<String>(e.getMessage(),
						HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		
		@RequestMapping(value = "/getall", method = RequestMethod.GET)
		@ResponseBody
		public ResponseEntity<List<RespostaImpl>> getAll() {
			
			try{
				
				List<RespostaImpl> respostas = service.findAll();
				return new ResponseEntity<List<RespostaImpl>>(respostas, HttpStatus.OK);
				
			}catch(Exception e){
				e.printStackTrace();
				return new ResponseEntity<List<RespostaImpl>>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		
		@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
		@ResponseBody
		public ResponseEntity<RespostaImpl> testeJson(@PathVariable Long id) {
			
			try{
				
				RespostaImpl resposta = service.find(id);
				
				return new ResponseEntity<RespostaImpl>(resposta, HttpStatus.OK);
				
			}catch(Exception e){
				e.printStackTrace();
				return new ResponseEntity<RespostaImpl>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
		
		@RequestMapping(value = "/deleteall", method = RequestMethod.GET)
		@ResponseBody
		public ResponseEntity<String> deleteAll(){
			try{
				service.deleteAll();
				return new ResponseEntity<String>("Todas as respostas e respostas foram deletadas",
						HttpStatus.OK);
			}catch(Exception e){
				return new ResponseEntity<String>(e.getMessage(),
						HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	
}
