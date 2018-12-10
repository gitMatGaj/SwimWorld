package full.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/", "/homepage" })
public class DemoController {

	@RequestMapping(method = GET)
	public String home() {
		return "home";
	}

	@GetMapping("/main")
	public String showMain() {

		return "main";
	}
	
	@GetMapping("/swimWebsite")
	public String swim() {
		return "swimWebsite";
	}
	

}






