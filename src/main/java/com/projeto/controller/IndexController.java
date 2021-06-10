package com.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class IndexController {

		@RequestMapping("/")
		public ModelAndView index() {
			//retorna a view q deve ser chamada  no caso (home.jsp)
			return new ModelAndView("index.html");
		
		}

	}