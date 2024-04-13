package com.real.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.real.app.entity.Hsplentity;
import com.real.app.repo.Hsplrepo;

@Service
public class Hsplservice {
	
	@Autowired
	Hsplrepo hsplrepo;
	

	public Hsplentity addHspltodb(Hsplentity hspl) {
		return hsplrepo.save(hspl);
		
	}

	public Hsplentity getPatientById( int id) {
		return hsplrepo.getByPid(id);
	}

}
