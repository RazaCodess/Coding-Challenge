package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Enrollees;

public interface EnrolleesRepository extends JpaRepository<Enrollees, Integer> {

	void update(Enrollees entity);

}
