package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller
@RequestMapping("/emp")
public class Controllercls {

	// injecting service class(DAO)
	@Autowired
	private ServiceEmp service;

	// fetch all emp
	@GetMapping({"", "/"})
    public String viewHomePage(Model model) {
        List<employee> list = service.getAllEmployees();
        model.addAttribute("listEmp", list);
        return "index";
    }

	// showForm to add new emp
    @GetMapping("/new")
    public String showNewEmpForm(Model model) {
        employee emp = new employee();
        model.addAttribute("emp", emp);
        return "new_employee";
    }
    
    // save new emp
    @PostMapping("/save")
    public String saveEmp(@ModelAttribute("emp") employee emp, RedirectAttributes redirectAttributes) {
        service.addEmployee(emp);
        redirectAttributes.addFlashAttribute("message", "✅ Employee added successfully!!");
        return "redirect:/emp";
    }

 // show form to update emp
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        employee emp = service.getAllEmployees().stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("emp", emp);
        return "edit_employee";
    }
    
    // update emp
    @PostMapping("/update/{id}")
    public String updateEmp(@PathVariable("id") int id, @ModelAttribute("emp") employee emp, RedirectAttributes redirectAttributes) {
        service.updateEmployee(id, emp);
        redirectAttributes.addFlashAttribute("message", "✏️ Employee updated successfully!");
        return "redirect:/emp";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmp(@PathVariable("id") int id, RedirectAttributes redirectAttributes) {
        service.deleteEmployee(id);
        redirectAttributes.addFlashAttribute("message", "🗑️ Employee deleted successfully!");
        return "redirect:/emp";
    }
}
