package com.jurrasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JurrasicHelloController {

	@RequestMapping("/welcome")
	public ModelAndView hello()
	{
		String message = "<center>Ok Done</center>";
		return new ModelAndView("welcome","message", message);
	}
	
}
