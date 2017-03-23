package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;

	public OwnerRepository getOwnerRepository() {
		return ownerRepository;
	}

	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}
	
	public Owner findById(Integer id){
		return ownerRepository.findById(id);
	}
	
	public List<Owner> findByFirstNameContaining(String firstName,String lastName){
		return ownerRepository.findByFirstNameContaining(firstName, lastName);
	}
	
}
