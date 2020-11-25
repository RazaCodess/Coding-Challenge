package com.EnrolleeDependentApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EnrolleeDependentService.ServiceForDependent;
import com.controller.VO.VOForDependents;


@RestController
@RequestMapping("/v2")
public class ApiControllerDependents {

	
	@Autowired
	private ServiceForDependent serviceForDependent;
	
	@PostMapping("/api/dependents/save")
	public void addDependents(@RequestBody VOForDependents vOForDependents) 
	{
		serviceForDependent.save(vOForDependents);
	}
	
	
	@PutMapping("/api/dependents/update")
	public boolean updateDependent (@RequestBody VOForDependents vOForDependents)
	{
		try {
			
		    serviceForDependent.update(vOForDependents);
		   return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	

	@DeleteMapping("/api/enrollees/delete")
	public void deleteDependent (@PathVariable int id)
	{
		serviceForDependent.delete(id);
	}
	
	
}
