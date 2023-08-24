package com.skcet.day7.Controller;


import java.util.List;

//import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day7.Model.FoodModel;
import com.skcet.day7.Service.FoodService;

@RestController
public class FoodController {
	@Autowired
   public FoodService fs;
	
	@PostMapping("/postFood")
	public String postFood(@RequestBody FoodModel fm) {
		
		fs.saveFood(fm);
		return "data saved";
	}
	@GetMapping("/sort/{name}")
	public List<FoodModel> sortByAsc(@PathVariable("name") String name){
		return fs.sortByAsc(name);
	}
	//Pagination
	@GetMapping("/pagination/{num}/{size}")
	public List<FoodModel> paginationEx(@PathVariable("num") int num,@PathVariable("size") int size)
	{
		return fs.pagination(num,size);
	}
	//pagination and sorting
	@GetMapping("/paginationAndSort/{num}/{size}/{name}")
	public List<FoodModel> paginationAndSort(@PathVariable("num") int num,@PathVariable("size") int size,@PathVariable("name")  String name)
	{
		return fs.paginationAndSorting(num,size,name);
	}
}