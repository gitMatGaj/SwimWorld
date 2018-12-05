package full.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import full.user.CrmUser;

@Controller
@RequestMapping({"/","/homepage"})
public class HomeController {

	@RequestMapping(method=GET) 
	public String home() {
	return "home";
	}
	@GetMapping("/swimWebsite") 
	public String swim() {
	return "swimWebsite";
	}

}
