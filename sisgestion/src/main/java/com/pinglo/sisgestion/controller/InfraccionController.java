package com.pinglo.sisgestion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arcila.sistemaalmacen.entity.Categoria;
import com.pinglo.sisgestion.service.impl.CategoriaServiceImpl;

@RestController
@RequestMapping("/api/infracciones")
public class InfraccionController {
	@Autowired
	private InfraccionServiceImpl service;
	
	
	@GetMapping() 
	public ResponseEntity<List<Infraccion>> getAll(){
		List<Infraccion> infracciones= service.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(infracciones);
	}
	


	@GetMapping(value="/{id}") 
	public ResponseEntity<Infraccion> getById(@PathVariable("id") int id) {
		Infraccion infraccion = service.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(infraccion);
	}
	

	@PostMapping 
	public ResponseEntity<Infraccion> create(@RequestBody Infraccion infraccion) {
		infraccion infraccionDb=service.create(infraccion);
		return ResponseEntity.status(HttpStatus.CREATED).body(infraccionDb);
	}
	

	@PutMapping
	public ResponseEntity<Infraccion> update(@RequestBody Infraccion infraccion) {
		Infraccion infraccionDb=service.update(infraccion);
		return ResponseEntity.status(HttpStatus.OK).body(infraccionDb);
	}
	

	@DeleteMapping(value="/{id}")
	public int delete(@PathVariable("id") int id){
		return service.delete(id);
	}
}
