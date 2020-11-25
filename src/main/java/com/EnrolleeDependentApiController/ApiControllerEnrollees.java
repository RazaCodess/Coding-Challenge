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
import com.EnrolleeDependentService.ServiceForEnrollee;
import com.controller.VO.VOForDependents;
import com.controller.VO.VOForEnrollees;

@RestController
@RequestMapping("/v1")
public class ApiControllerEnrollees {

	
	@Autowired
	private ServiceForEnrollee serviceForEnrollee;
	
	
	
	@PostMapping("/api/enrollees/save")
	public void addEnrollees(@RequestBody VOForEnrollees vOForEnrollees) 
	{
		serviceForEnrollee.save(vOForEnrollees);
	}
	
	@PutMapping("/api/enrollees/update")
	public void updateEnrollee (@ModelAttribute VOForEnrollees vOForEnrollees)
	{
		
		serviceForEnrollee.update(vOForEnrollees);
	}
	
	
	@DeleteMapping("/api/enrollees/delete")
	public void deleteEnrollee (@PathVariable int id)
	{
		serviceForEnrollee.delete(id);
	}
	



	
	
	
}
