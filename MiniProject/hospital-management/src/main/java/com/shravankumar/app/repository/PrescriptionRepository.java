package com.shravankumar.app.repository;

import com.shravankumar.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PrescriptionRepository extends MongoRepository<Prescription,String> {
    public List<Prescription>findByPatientName(String patientname);
    public Prescription save(Prescription prescription);
}
