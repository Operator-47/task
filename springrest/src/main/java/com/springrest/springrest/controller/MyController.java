package com.springrest.springrest.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.load;
import com.springrest.springrest.services.LoadService;



@RestController
public class MyController {
	
	
	@Autowired
	private LoadService loadser;
	
	
	
	//get load list details
	
	@GetMapping("/load")
	public List<load> getload(){
		return this.loadser.getload();
	}
	
	//specific load detail using shipperid
	@GetMapping("/load/{shipperid}")
	public load getload1(@PathVariable int shipperid) {
		return this.loadser.getload1(shipperid);
	}
	
	//add new load details
	@PostMapping(path="/load",consumes="application/json")
	public load addLoad(@RequestBody load l1){
		return this.loadser.addLoad(l1);
	}
	
	//update load details
	@PutMapping("/load")
	public load updateLoad(@RequestBody load l1) {
		return this.loadser.updateLoad(l1);
	}
		
	
	//delete load details
	@DeleteMapping("/load/{shipperid}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable int shipperid){
		
		try {
			this.loadser.deleteLoad(shipperid);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		}
	
}
