package com.skcet.day7.Service;

import java.util.List;

//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.skcet.day7.Model.FoodModel;
import com.skcet.day7.Repository.FoodRepos;


@Service
public class FoodService {
 @Autowired
	public  FoodRepos frep;
 
  public String saveFood(FoodModel f) {
	  frep.save(f);
	  return "Data is saved to database";
  }
  public List<FoodModel> sortByAsc(String name){
	 // return frep.findAll(Sort.by(name).descending());
	  return frep.findAll(Sort.by(name).ascending());
  }
  //pagination
  public List<FoodModel> pagination(int pageNo,int pageSize){
	  Page<FoodModel> cont=frep.findAll(PageRequest.of(pageNo,pageSize));
	  return cont.getContent();
  }
//and sorting
  public List<FoodModel> paginationAndSorting(int pageNo,int pageSize,String name)
  {
	  Page<FoodModel> cont1=frep.findAll(PageRequest.of(pageNo, pageSize,Sort.by(name)));
	  return cont1.getContent();
  }
}