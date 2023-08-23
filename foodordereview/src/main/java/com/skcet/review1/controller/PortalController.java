package com.skcet.review1.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import com.review1.day5.model.PortalModel;
//import com.review1.day5.service.PortalService;
import com.skcet.review1.model.PortalModel;
import com.skcet.review1.service.PortalService;

@RestController
public class PortalController {
	@Autowired
   public PortalService hserv;
	
	@PostMapping("/postPortal")
	public String postPortal(@RequestBody PortalModel hr) {
		
		hserv.savePortal(hr);
		return "data saved";
	}
	@GetMapping("/getPortal")
	public List<PortalModel> getPortalInfo(){
		return hserv.getPortal();
	}
	@PutMapping("/updatePortal")
	public PortalModel updatePortalInfo(@RequestBody PortalModel hm) {
		return hserv.updatePortal(hm);
	}
	@DeleteMapping("/delete/{PortalId}")
	public String deleted(@PathVariable("PortalId")int PortalId) {
		hserv.deletePortal(PortalId);
		return "name with Id "+PortalId+" is deleted";}
	@DeleteMapping("/reqparam/{id}")public String removeByreq(@RequestParam("id")int id)
	{
		hserv.deletePortal(id);
		return "Portal with ID "+id+" is deleted";
		
	}
		@DeleteMapping("/deletePortalif/{id}")
	
	public ResponseEntity<String> deletePortalInfo(@PathVariable int id){
		boolean deleted = hserv.deletePortalif(id);
		if(deleted) {
			return ResponseEntity.ok("Portal with ID "+id+" deleted successfully");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Portal with ID "+id+" not found");
		}
	}
	//getUserbyId
	@GetMapping("/users/{userId}")
	public ResponseEntity<?> getUserbyId(@PathVariable int userId){
		Optional<PortalModel> portal = hserv.getUserId(userId);
		if(portal!=null) {
			return ResponseEntity.ok(portal);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID ");
	}
	
	
	
	}

