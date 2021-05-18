package com.example.spingbootformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {
	
	@GetMapping("/")
	public String indexForm(Model model) {
		model.addAttribute("feeCalculator", new FeeCalculator());
		model.addAttribute("transaction", new Transaction());
		return "index";
	}
	
	

}
