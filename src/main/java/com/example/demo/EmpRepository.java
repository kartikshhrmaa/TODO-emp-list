package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<employee, Integer> {

}
