package com.EnrolleeDependentService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.Entity.Dependents;
import com.Entity.Enrollees;
import com.controller.VO.VOForDependents;
import com.repository.DependentsRepository;

public class ServiceForDependent {

	@Autowired
	private DependentsRepository dependentRepository; 
	
	
	public void save(VOForDependents vOForDependents)
	{
		Dependents entity = new Dependents();
		BeanUtils.copyProperties(vOForDependents, entity);
		dependentRepository.save(entity);
	}


	public void update(VOForDependents vOForDependents) {
		Dependents dependents = dependentRepository.findById(vOForDependents.getId()).get();
	
		dependents.setName(vOForDependents.getName());
		dependents.setBirthday(vOForDependents.getBirthday());
		
		dependentRepository.save(dependents); 
		
	}


	public void delete(int id) {
		dependentRepository.deleteById(id);
		
	}
	
	
	
	
	
	
	
}
