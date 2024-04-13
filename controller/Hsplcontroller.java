package com.real.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.real.app.entity.Hsplentity;
import com.real.app.service.Hsplservice;

@RestController
@RequestMapping("/real")
public class Hsplcontroller {
	
	@Autowired
	Hsplservice hsplservice;
	
@PostMapping("/hspl/add")
public Hsplentity addNewHspl(@RequestBody Hsplentity hspl) {
	
	
	return hsplservice.addHspltodb(hspl);
}
@GetMapping("/hspl/{id}")
public Hsplentity getHsplentityByid(@PathVariable int id) {
	
	return hsplservice.getPatientById(id);
}
}
