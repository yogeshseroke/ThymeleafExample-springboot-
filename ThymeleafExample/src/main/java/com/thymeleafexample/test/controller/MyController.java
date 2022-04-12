package com.thymeleafexample.test.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler.....");
		model.addAttribute("name","yogesh");
		model.addAttribute("currentDate", new Date().toLocaleString());
		return "about";
	}
	@GetMapping("/loopexample")
	public String iterateHandler(Model m) {
		
		List<String>names=new ArrayList();
		names.add("a");
		names.add("b");
		names.add("c");
		names.add("d");
		names.add("e");
		m.addAttribute("naam",names);
		return "iterate";
	}
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
			m.addAttribute("isActivate",true);
			m.addAttribute("gender","F");
			List<Integer>lt=new ArrayList();
			lt.add(1);
			lt.add(2);
			lt.add(3);
			lt.add(4);
			lt.add(5);
			m.addAttribute("list",lt);
			return "condition";
			
	}
	
	@GetMapping("/service")
	public String servicesHandler(Model m)
	{
		return "service";
	}
}
