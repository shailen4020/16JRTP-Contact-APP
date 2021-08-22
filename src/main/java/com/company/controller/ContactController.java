package com.company.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//import com.company.service.ContactService;


@Controller
public class ContactController {
	
	@GetMapping("/")
	public String index()
	{
	
		return "index";
	
	}
	
}
