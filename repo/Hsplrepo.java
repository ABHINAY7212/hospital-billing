package com.real.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.real.app.entity.Hsplentity;

public interface Hsplrepo extends JpaRepository<Hsplentity,Integer>{

	Hsplentity getByPid(int id);

 

	
}
