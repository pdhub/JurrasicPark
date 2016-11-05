package com.jurrasic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.jurrasic.model.Dinosaur;
import com.jurrasic.service.DinosaurSevice;

@Controller
public class JurrasicHelloController {

	private DinosaurSevice dinosaurService;
	
	@Autowired(required=true)
	@Qualifier(value="dinosaurService")
	public void setDinoservice(DinosaurSevice dinosaurService) {
		this.dinosaurService = dinosaurService;
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String listDinos(Model model)
	{
		/*String message = "<center>Ok Done</center>";
		return new ModelAndView("welcome","message", message);*/
		model.addAttribute("dinos", new Dinosaur());
		model.addAttribute("listdinos",this.dinosaurService.getAllDinos());
		return "dinos";
	}
	
}
