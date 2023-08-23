package com.skcet.review1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.skcet.review1.model.PortalModel;
import com.skcet.review1.repository.PortalRepo;


@Service
public class PortalService {
 @Autowired
	public  PortalRepo hrepo;
 
  public String savePortal(PortalModel h) {
	  hrepo.save(h);
	  return "Data is saved to database";
  }
  public List<PortalModel> getPortal(){
	  return hrepo.findAll();
  }
  public PortalModel updatePortal(PortalModel hm) {
	  return hrepo.saveAndFlush(hm);
  }
  public boolean deletePortalif(int portalId) {
	  if(hrepo.existsById(portalId)) {
		  hrepo.deleteById(portalId);
		  return true;
	  }
	  return false;
  }
  public void deletePortal(int portal_id) {
	  System.out.println("Deleted");
	  hrepo.deleteById(portal_id);
  }
  public Optional<PortalModel> getUserId(int userId){
	  Optional <PortalModel> portal=hrepo.findById(userId);
	  if(portal.isPresent()) {
		  return portal;
	  }
	  return null;
	  
  }
  
}
