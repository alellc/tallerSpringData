package org.springframework.samples.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Specialty;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService {

	@Autowired
	private SpecialityService specialityService;

	public SpecialityService getSpecialityService() {
		return specialityService;
	}

	public void setSpecialityService(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}
	
	public Specialty findFirstByName(String name){
		return specialityService.findFirstByName(name);
	}
}
