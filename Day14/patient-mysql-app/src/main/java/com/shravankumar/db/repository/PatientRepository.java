package com.shravankumar.db.repository;

import com.shravankumar.db.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient,Integer> {
}
