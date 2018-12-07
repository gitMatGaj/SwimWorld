package full.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	// Show login page
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() {

		return "fancy-login";

	}

	// add request mapping for /access-denied
	// brak dostêpu
	@GetMapping("/access-denied")
	public String showAccessDenied() {

		return "access-denied";

	}

}








