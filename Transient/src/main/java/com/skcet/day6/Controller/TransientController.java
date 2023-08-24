package com.skcet.day6.Controller;


import java.util.List;

//import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day6.Model.TransientModel;
import com.skcet.day6.Service.TransientService;

@RestController
public class TransientController {
	@Autowired
   public TransientService fs;
	
	@PostMapping("/postTransient")
	public String postFood(@RequestBody TransientModel fm) {
		
		fs.saveTransient(fm);
		return "data saved";
	}
	@GetMapping("/sort/{name}")
	public List<TransientModel> sortByAsc(@PathVariable("name") String name){
		return fs.sortByAsc(name);
	}
	
}