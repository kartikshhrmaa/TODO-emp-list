package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEmp {

	@Autowired
	private EmpRepository empRepo;

	// fetch all employee
	public List<employee> getAllEmployees() {
		return empRepo.findAll();
	}

	// insert new emp
	public employee addEmployee(employee e) {
		return empRepo.save(e);
	}

	// creating new updatedEmp(instance) which contain updated details
	public boolean updateEmployee(Integer id, employee updatedEmp) {
		Optional<employee> existing = empRepo.findById(id);
		if (existing.isPresent()) { // if emp id matches
			updatedEmp.setId(id); // ensures ID consistency
			empRepo.save(updatedEmp); // replace old id with updated one
			return true;
		}
		return false; // if no id matches then return false
	}

	public boolean deleteEmployee(Integer id) {
		if (empRepo.existsById(id)) {
			empRepo.deleteById(id);
			return true;
		}
		return false;
	}
}
