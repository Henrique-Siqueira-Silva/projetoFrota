package com.example.frota.caminhao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;
import jakarta.transaction.Transactional;
 
@Controller
@RequestMapping
public class CaminhaoController {
	@GetMapping ("/formulario")                  
	public String carregaPaginaFormulario (Long id, Model model){
		
	    return "caminhao/formulario";              
	}
	
	
	@PostMapping
	@Transactional
	public String cadastrar (CadastroCaminhao dados) {
		Caminhao caminhao = new Caminhao(dados);
		return"";
		
	}
}