package full.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import full.user.CrmUser;

import full.service.UserService;
import full.entity.User;

@Controller
@RequestMapping("/admin")
public class AdminRules {

	@Autowired
	private UserService userService;

	// Admin view users
	@GetMapping("/list")
	public String listCustomers(Model theModel) {

		// get customers from the service
		List<User> theUsers = userService.getUsers();

		// add the customers to the model
		theModel.addAttribute("users", theUsers);

		return "listCustomers";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {

		// create model attribute to bind form data
		CrmUser theUser = new CrmUser();

		theModel.addAttribute("user", theUser);

		return "customer-form";
	}

	// ADMIN add add User
	@PostMapping("/saveUser")
	public String saveCustomer(@ModelAttribute("user") CrmUser theCrmUser) {

		// create user account
		userService.saveUser(theCrmUser);

		return "redirect:/admin/list";
	}

	// Admin delete user
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("UserId") Long theId) {

		// delete the user
		userService.deleteUser(theId);

		return "redirect:/admin/list";
	}

	// Admin update user
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("UserId") Long theId, Model theModel) {

		// get the customer from our service
		User theUser = userService.getUser(theId);

		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("user", theUser);

		// send over to our form
		return "customer-update";
	}

	@PostMapping("/saveUpdate")
	public String saveCustomer(@ModelAttribute("user") User user) {

		// save the customer using our service
		userService.saveUpdate(user);

		return "redirect:/admin/list";
	}

}
