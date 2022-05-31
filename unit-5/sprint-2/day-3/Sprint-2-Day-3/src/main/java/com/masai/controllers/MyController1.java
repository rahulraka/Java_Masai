package com.masai.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.classes.Products;
import com.masai.exception.*;

@RestController
public class MyController1 {
	
	Products p1=new Products();
	List<Products> l1=p1.listOfproduct();
	
@GetMapping("/products")
public List<Products> hi() {
	
	return l1;
}


@GetMapping("/products/{id}")
public Products singleProduct(@PathVariable ("id") int id) {
	
	for(Products p:l1) {
		if(p.getId()==id) return p;
	}
	throw new ProductnotFoundException("Product was not found in the Database");
	
}



@PostMapping("/enternew")
public String enterNew(@RequestBody Products p) {
	if(l1.contains(p)) {
		throw new ProductAlreadyExistException("Hore Bhai kya haal Hai...");
	}
	l1.add(p);
	return "Inserted in the List";
}



@DeleteMapping("/remove/{id}")
public String removeData(@PathVariable ("id") int id) {
	if(l1.removeIf(s->s.getId()==id)) return "Data was Deleted from the Database";
	else throw new ProductnotFoundException("Product was not found in the Database");
}


@PutMapping("products/{id}")
public String updateData( @RequestBody Products y, @PathVariable ("id") int id) {
	if(l1.removeIf(s->s.getId()==id)) {
		l1.add(y);
		return "Data Updated";
	}
	
	else throw new ProductnotFoundException("Product was not found in the Database");
	}
	
	

}
