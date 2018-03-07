package com.Evento.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	@RequestMapping("/CadastrarPessoa")
	public String form() 
	{
		return "Evento/formEvento";
	}

}
