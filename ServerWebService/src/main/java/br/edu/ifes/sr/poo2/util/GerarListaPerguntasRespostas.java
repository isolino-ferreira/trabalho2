package br.edu.ifes.sr.poo2.util;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifes.sr.poo2.model.NivelTerceiro;
import br.edu.ifes.sr.poo2.model.PerguntaImpl;
import br.edu.ifes.sr.poo2.model.RespostaImpl;

public class GerarListaPerguntasRespostas {

	public static List<PerguntaImpl> carregar(){
		List<PerguntaImpl> Perguntas = new ArrayList<PerguntaImpl>();
		
		//FACIL
		
		//Primeira Pergunta
		PerguntaImpl pergunta = new PerguntaImpl();
		RespostaImpl r1 = new RespostaImpl();
		RespostaImpl r2 = new RespostaImpl(); 
		RespostaImpl r3 = new RespostaImpl(); 
		pergunta.setValor("Qual e a Capital da Noruega?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		r1.setResposta("Zurique");
		r1.setVerdadeiro(false);
		r2.setResposta("Buenos Aires");
		r2.setVerdadeiro(false);
		r3.setResposta("Oslo");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//Segunda Pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("O relevo que caracteriza Brasilia e?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		r1.setResposta("Planalto");
		r1.setVerdadeiro(true);
		r2.setResposta("Planice");
		r2.setVerdadeiro(false);
		r3.setResposta("Depressao");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);

		//terceira pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Marte possui lua?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		r1.setResposta("Sim. Tem duas");
		r1.setVerdadeiro(true);
		r2.setResposta("Não.");
		r2.setVerdadeiro(false);
		r3.setResposta("Sim. Duas");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);

		//quarta pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Quais desses lagos estao na America do Sul?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		r1.setResposta("Vitoria");
		r1.setVerdadeiro(false);
		r2.setResposta("Titicaca");
		r2.setVerdadeiro(true);
		r3.setResposta("Huron");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);

		//quinta pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor(" Qual é o ponto mais profundo mundo?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		r1.setResposta("Fossa das Marianas");
		r1.setVerdadeiro(true);
		r2.setResposta("Triangulo das Bermudas");
		r2.setVerdadeiro(false);
		r3.setResposta("Dorsal Mesoatlântica");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		
		//sexta pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("A destruição das rochas preexistentes, por fragmentação,origina uma outra categoria de rochas, estas denominadas:");
		pergunta.setNivel(NivelTerceiro.FACIL);
		r1.setResposta("metamórficas-sedimentares");
		r1.setVerdadeiro(false);
		r2.setResposta("plutônicas-magmáticas");
		r2.setVerdadeiro(false);
		r3.setResposta("sedimentares-detríticas");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//setima pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual a capital do Estados unidos da America?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		r1.setResposta("Nova Iorque");
		r1.setVerdadeiro(false);
		r2.setResposta("Washington");
		r2.setVerdadeiro(true);
		r3.setResposta("Texas");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//oitava pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual a Capital do Peru?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		r1.setResposta("Lima");
		r1.setVerdadeiro(true);
		r2.setResposta("Machu-Pichu");
		r2.setVerdadeiro(false);
		r3.setResposta("Venezuela");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//nona pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual a Capital do Japão?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		r1.setResposta("Kioto");
		r1.setVerdadeiro(false);
		r2.setResposta("Hiroshima");
		r2.setVerdadeiro(false);
		r3.setResposta("Tokyo");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//decima pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual o pais cuja capital e Paris?");
		pergunta.setNivel(NivelTerceiro.FACIL);
		r1.setResposta("Inglaterra");
		r1.setVerdadeiro(false);
		r2.setResposta("Portugal");
		r2.setVerdadeiro(false);
		r3.setResposta("França");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//MEDIA
		
		//Primeira Pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl(); 
		r3 = new RespostaImpl(); 
		pergunta.setValor("Qual dessas cidades NAO é uma capital?");
		pergunta.setNivel(NivelTerceiro.MEDIO);
		r1.setResposta("Wellington");
		r1.setVerdadeiro(false);
		r2.setResposta("Sydney");
		r2.setVerdadeiro(true);
		r3.setResposta("Port Moresby");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//Segunda Pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual dessas formações corresponte a uma penisula?");
		pergunta.setNivel(NivelTerceiro.MEDIO);
		r1.setResposta("Bering");
		r1.setVerdadeiro(false);
		r2.setResposta("Magalhes");
		r2.setVerdadeiro(false);
		r3.setResposta("Yucatan ");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);

		//terceira pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual e o setimo planeta do Sistema Solar?");
		pergunta.setNivel(NivelTerceiro.MEDIO);
		r1.setResposta("Netuno");
		r1.setVerdadeiro(false);
		r2.setResposta("Urano");
		r2.setVerdadeiro(true);
		r3.setResposta("Plutão");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);

		//quarta pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual é o rio mais extenso do mundo?");
		pergunta.setNivel(NivelTerceiro.MEDIO);
		r1.setResposta("Amazonas");
		r1.setVerdadeiro(true);
		r2.setResposta("Congo");
		r2.setVerdadeiro(false);
		r3.setResposta("Nilo");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);

		//quinta pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("O clima subtropical brasileiro é característico dos estados de:");
		pergunta.setNivel(NivelTerceiro.MEDIO);
		r1.setResposta("São Paulo e Pernambuco");
		r1.setVerdadeiro(false);
		r2.setResposta("Paraná e Pará");
		r2.setVerdadeiro(false);
		r3.setResposta("Santa Catarina e Rio Grande do Sul");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		
		//sexta pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Oriundas da erosão marinha, estas costas caracterizam-se por serem altas,correspondendo aos trechos entre a serra do Mar e o Planalto Meridional.");
		pergunta.setNivel(NivelTerceiro.MEDIO);
		r1.setResposta("costas baixas");
		r1.setVerdadeiro(false);
		r2.setResposta("costas de abrasão");
		r2.setVerdadeiro(true);
		r3.setResposta("costas de acumulação");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//setima pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual pais cuja capital e Sofia?");
		pergunta.setNivel(NivelTerceiro.MEDIO);
		r1.setResposta("Romenia");
		r1.setVerdadeiro(false);
		r2.setResposta("Lituania");
		r2.setVerdadeiro(false);
		r3.setResposta("Bulgaria");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//oitava pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual capital de Cuba?");
		pergunta.setNivel(NivelTerceiro.MEDIO);
		r1.setResposta("Havana");
		r1.setVerdadeiro(true);
		r2.setResposta("Bayano");
		r2.setVerdadeiro(false);
		r3.setResposta("Santigo de Cuba");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//nona pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual a Capital da Jamaica?");
		pergunta.setNivel(NivelTerceiro.MEDIO);
		r1.setResposta("Kingston");
		r1.setVerdadeiro(true);
		r2.setResposta("Spanish Town");
		r2.setVerdadeiro(false);
		r3.setResposta("Sao Cosme");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//decima pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual a Capital da Africa do Sul?");
		pergunta.setNivel(NivelTerceiro.MEDIO);
		r1.setResposta("Cidade do Cabo");
		r1.setVerdadeiro(true);
		r2.setResposta("Soweto");
		r2.setVerdadeiro(false);
		r3.setResposta("Joanesburgo");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);

		//DIFICIL
		
		//Primeira Pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl(); 
		r3 = new RespostaImpl(); 
		pergunta.setValor("Qual a capital do Turquia?");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		r1.setResposta("Bursa");
		r1.setVerdadeiro(false);
		r2.setResposta("Instambul");
		r2.setVerdadeiro(false);
		r3.setResposta("Ancara");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//Segunda Pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Sobre o relevo brasileiro, a afirmativa incorreta é:");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		r1.setResposta("Toda região centro-oeste apresenta o relevo do tipo chapada.");
		r1.setVerdadeiro(true);
		r2.setResposta("As rochas mais antigas, de idade pré-cambriana, constituem o Complexo Cristalino.");
		r2.setVerdadeiro(false);
		r3.setResposta("As chapadas Nordestinas são remanescentes de antiga cobertura sedimentar.");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);

		//terceira pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual o desses nomes corresponde a uma lua do planeta Jupiter?");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		r1.setResposta("Titan");
		r1.setVerdadeiro(false);
		r2.setResposta("Calisto");
		r2.setVerdadeiro(true);
		r3.setResposta("Proteu");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);

		//quarta pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual a Capital do Canada?");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		r1.setResposta("Toronto");
		r1.setVerdadeiro(false);
		r2.setResposta("Otawwa");
		r2.setVerdadeiro(true);
		r3.setResposta("Vancouver");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);

		//quinta pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual a capital da Costa do marfin?");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		r1.setResposta("Abidjan");
		r1.setVerdadeiro(false);
		r2.setResposta("Yamoussoukro");
		r2.setVerdadeiro(true);
		r3.setResposta("Honolulu");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		
		//sexta pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual a capital da Guiana?");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		r1.setResposta("Georgetown");
		r1.setVerdadeiro(true);
		r2.setResposta("Anna Regina");
		r2.setVerdadeiro(false);
		r3.setResposta("Bartica");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//setima pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual a capital do Suriname?");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		r1.setResposta("Albina");
		r1.setVerdadeiro(false);
		r2.setResposta("Lelydorp");
		r2.setVerdadeiro(false);
		r3.setResposta("Paramaribo");
		r3.setVerdadeiro(true);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//oitava pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual o pais cuja capital é Manilla?");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		r1.setResposta("Filipinas");
		r1.setVerdadeiro(true);
		r2.setResposta("El Salvador");
		r2.setVerdadeiro(false);
		r3.setResposta("Congo");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//nona pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual o pais cuja a capital e Mascate?");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		r1.setResposta("Oma");
		r1.setVerdadeiro(true);
		r2.setResposta("Yemen");
		r2.setVerdadeiro(false);
		r3.setResposta("Arabia Saudita");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		//decima pergunta
		pergunta = new PerguntaImpl();
		r1 = new RespostaImpl();
		r2 = new RespostaImpl();
		r3 = new RespostaImpl();
		pergunta.setValor("Qual a capital dos Emirados Árabes Unidos?");
		pergunta.setNivel(NivelTerceiro.DIFICIL);
		r1.setResposta("Dubai");
		r1.setVerdadeiro(false);
		r2.setResposta("Abu Dhabi");
		r2.setVerdadeiro(true);
		r3.setResposta("Agrabah");
		r3.setVerdadeiro(false);
		pergunta.addResposta(r1);
		pergunta.addResposta(r2);
		pergunta.addResposta(r3);
		Perguntas.add(pergunta);
		
		return Perguntas;

	}
}
