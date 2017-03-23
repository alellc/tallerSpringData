package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.stereotype.Service;

@Service
public class VetService {
	
	@Autowired
	private VetRepository vetRepository;

	public VetRepository getVetRepository() {
		return vetRepository;
	}

	public void setVetRepository(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}
	
	public List<Vet> findByLastName(String lastName){
		return vetRepository.findByLastName(lastName);
		
	}
	public List<Vet> findByLastNameAndFirstName(String lastName,String firtName){
		return vetRepository.findByLastNameAndFirstName(lastName, firtName);
	}
	
	public List<Vet> findByLastNameOrFirstName(String lastName,String firtName){
		return vetRepository.findByLastNameOrFirstName(lastName, firtName);
	}
	
	public List<Vet> findBySpecialityName(@Param("name") String name){
		return vetRepository.findBySpecialityName(name);
	}
	
}
