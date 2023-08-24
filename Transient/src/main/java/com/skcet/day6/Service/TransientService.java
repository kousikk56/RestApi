package com.skcet.day6.Service;

import java.util.List;

//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.skcet.day6.Model.TransientModel;
import com.skcet.day6.Repository.TransientRepos;


@Service
public class TransientService {
 @Autowired
	public  TransientRepos frep;
 
  public String saveTransient(TransientModel f) {
	  frep.save(f);
	  return "Data is saved to database";
  }
  public List<TransientModel> sortByAsc(String name){
	 // return frep.findAll(Sort.by(name).descending());
	  return frep.findAll(Sort.by(name).ascending());
  }
  
}