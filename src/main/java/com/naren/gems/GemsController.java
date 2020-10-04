package com.naren.gems;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GemsController {

	@GetMapping("/")
	public String greeting(@RequestParam(name = "color", required = false) String color, Model model) {
		if (color == null)
			color = System.getenv("ENV_BG_COLOR") == null ? "white" : System.getenv("ENV_BG_COLOR");
		model.addAttribute("color", color);
		model.addAttribute("msg", System.getenv("ENV_MSG"));
		return "index";
	}

}