package com.sip.ams.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProviderController {
	@RequestMapping("/welcome")
	public String welcome(Model model) {

		String descrition = "pour plus d'inforamtion";
		model.addAttribute("desc", descrition);
		return "provider/welcome";
	}

	@RequestMapping("/details")
	public String details(Model model) {
		
		String names[]={"hanen","ali","marwen","sami"};
		model.addAttribute("names", names);
		
		List<Provider> providers = new ArrayList <>();
		providers.add(new Provider ("samsung","Korea","123456789"));
		providers.add(new Provider ("hp","USA","23456"));
		providers.add(new Provider ("evertek","japan","558877"));
		model.addAttribute("providers", providers);
		return "provider/details";
		
	}
}
