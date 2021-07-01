package com.example.spingbootformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	
	double profit = 0;
	double fees = 0;
	
	@GetMapping("/")
	public String indexForm(Model model) {
		model.addAttribute("transaction", new Transaction());
		return "index";
	}
	
	@GetMapping("/profit")
	public String profitForm(Model model) {
		return "profit";
	}
	
	@GetMapping("/clear")
	public String clearForm(Model model) {
		return "clear";
	}
	
	@PostMapping("/profit")
	public String indexSubmit(@ModelAttribute FeeCalculator fc, @ModelAttribute Transaction t, Model model) {
		model.addAttribute("feeCalculator", fc);
		model.addAttribute("transaction", t);
		fc.calculate(t, profit, fees);
		profit = fc.getProfit();
		fees = fc.getFees();
		return "profit";
	}
	
	@PostMapping("/clear")
	public void clear() {
		profit = 0;
		fees = 0;
	}
	

}
