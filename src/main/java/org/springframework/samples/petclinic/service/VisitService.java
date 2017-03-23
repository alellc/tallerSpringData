package org.springframework.samples.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitService {

	@Autowired
	private VisitRepository visitRepository;

	
	public VisitRepository getVisitRepository() {
		return visitRepository;
	}

	public void setVisitRepository(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}

	public void setVisitService(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}
	
	public List<Visit> findByPetId(Integer petId){
		return visitRepository.findByPetId(petId);
	}
    
    public List<Visit> findTop3ByOrderByDateDesc(){
    	return visitRepository.findTop3ByOrderByDateDesc();
    }
    public Visit save(Visit v){
    	return visitRepository.save(v);
    }
}
