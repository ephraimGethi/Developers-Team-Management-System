package net.software.tracking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.software.tracking.entity.Developer;
import net.software.tracking.service.developerService;

@Controller
public class DeveloperController {
	private developerService developerservice;
	@GetMapping("/developers")
	public String listDevelopers(Model model) {
		model.addAttribute("developers",developerservice.getAllDevelopers());
     return "developers";
}
	@GetMapping("/developers/new")
	public String createDeveloperForm(Model model) {
Developer developer = new Developer();
model.addAttribute(developer);
return "add_developer";
	}
	@PostMapping("/developers")
	public String createNewDev(@ModelAttribute("developer") Developer developer) {
		developerservice.saveDeveloper(developer);
		return "redirect:/developers";
	}
	@GetMapping("/developers/edit/{id}")
	public String editDevelopersForm(@PathVariable Long id, Model model) {
		model.addAttribute("developer",developerservice.getDeveloperById(id));
		return "edit_developer_details";
	}
	@PostMapping("/developers/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("developer") Developer developer) {
		
		Developer existingDeveloper = developerservice.getDeveloperById(id);
		existingDeveloper.setId(id);
		existingDeveloper.setFirstName(developer.getFirstName());
		existingDeveloper.setLastName(developer.getLastName());
		existingDeveloper.setDaysAvailable(developer.getDaysAvailable());
		existingDeveloper.setRole(developer.getRole());
		existingDeveloper.setContribution(developer.getContribution());
		developerservice.saveDeveloperEdit(existingDeveloper);
		return "redirect:/developers";
	}
	@GetMapping("/developers/{id}")
	public String deleteDeveloper(@PathVariable Long id) {
		developerservice.deleteDeveloper(id);
		return "redirect:/developers";
	}
	
	public developerService getDeveloperservice() {
		return developerservice;
	}
	public void setDeveloperservice(developerService developerservice) {
		this.developerservice = developerservice;
	}
	public DeveloperController(developerService developerservice) {
		super();
		this.developerservice = developerservice;
	}
	
	
}
