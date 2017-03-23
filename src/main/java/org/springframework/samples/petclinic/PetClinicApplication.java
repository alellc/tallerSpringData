/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.samples.petclinic.model.Specialty;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.SpecialityRepository;
import org.springframework.samples.petclinic.repository.VetRepository;

/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */
@SpringBootApplication
public class PetClinicApplication {
	
	private static final Logger log = LoggerFactory.getLogger(PetClinicApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PetClinicApplication.class, args);
    }
    
    @Bean
	public CommandLineRunner demoVetRepository(OwnerRepository ownerRepositoy,PetRepository petRepository,VetRepository vetRepository, SpecialityRepository specialityRepository, OwnerRepository ownerRepository) {
		return (args) -> {
			log.info("*****************************************************");
			log.info("BOOTCAMP - Spring y Spring Data - vetRepository");
			log.info("*****************************************************");
			/*
			Vet vet = new Vet();
			vet.setFirstName("Coco");
			vet.setLastName("Perez");
			
			//persistir en la BBDD
			vet = vetRepository.save(vet);
			//Busco a ese vet por su id
			vet = vetRepository.findOne(vet.getId());
			
			//Mostramos los datos de vet
			log.info(vet.toString());
			
			//Creo y añado la especialidad
			Specialty spe=specialityRepository.findOne(1);
			vet.addSpecialty(spe);
			//Me traigo todos los vet
			List <Vet> lista= vetRepository.findAll();
			//Muestro todos los vet
			for (Vet v : lista) {
				log.info(v.toString());
			}
			
			//Mostramos que los metodos agregados ha vetRepository funcionan
			for (Vet vet1 : vetRepository.findByLastName("Carter")) {
				log.info(vet1.toString());
			}
			
			for (Vet vet2 : vetRepository.findByLastNameAndFirstName("Perez", "Coco")) {
				log.info(vet2.toString());
			}
			
			for (Vet vet3 : vetRepository.findByLastNameOrFirstName("Carter", "Coco")) {
				log.info(vet3.toString());
			}
			*/
			//RETO
			/*GregorianCalendar f=new GregorianCalendar(2010, 01, 01);
			GregorianCalendar f2=new GregorianCalendar(2010, 12, 30);
			Date fecha=f.getTime();
			Date fecha2=f.getTime();
			List <Pet>listaPet = petRepository.findByBirthDateBetweenOrderByBirthDateAsc(fecha, fecha2);
			for (Pet p : listaPet) {
				log.info(p.toString());
			}*/
			Visit v1=new Visit();
			v1.setBill(null);
		};
	}
    
}
