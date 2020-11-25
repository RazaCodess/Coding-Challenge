package com.EnrolleeDependentService;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.Entity.Dependents;
import com.Entity.Enrollees;
import com.controller.VO.VOForEnrollees;
import com.repository.EnrolleesRepository;



public class ServiceForEnrollee {
	
	@Autowired 
	private EnrolleesRepository enrolleesRepository; 

	

	@Transactional 
	public void save(VOForEnrollees vOForEnrollees) {
		
		Enrollees entity = new Enrollees();
		BeanUtils.copyProperties(vOForEnrollees, entity);
		enrolleesRepository.save(entity);
		
		
	}

	@Transactional
	public void update(VOForEnrollees vOForEnrollees) {
		Enrollees enrollees = enrolleesRepository.findById(vOForEnrollees.getId()).get();
		
		enrollees.setName(vOForEnrollees.getName());
		enrollees.setBirthday(vOForEnrollees.getBirthday());
		enrolleesRepository.save(enrollees);
	}
	
	@Transactional
	public void delete(int id)
	{
		enrolleesRepository.deleteById(id);
	}
	
	
	
	
	
	
}
