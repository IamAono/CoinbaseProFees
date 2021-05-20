package com.example.spingbootformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Index {
	
	@GetMapping("/")
	public String indexForm(Model model) {
		model.addAttribute("feeCalculator", new FeeCalculator());
		model.addAttribute("transaction", new Transaction());
		return "index";
	}
	
	@PostMapping("/")
	public String indexSubmit(@ModelAttribute FeeCalculator fc, @ModelAttribute Transaction t, Model model) {
		model.addAttribute("feeCalculator", fc);
		model.addAttribute("transaction", t);
		return "profit";
	}
	

}
