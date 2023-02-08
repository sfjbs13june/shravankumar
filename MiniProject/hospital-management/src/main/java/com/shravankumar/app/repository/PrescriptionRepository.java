package com.shravankumar.app.repository;

import com.shravankumar.app.model.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrescriptionRepository extends MongoRepository<Prescription,String> {
    public Prescription findByPatientName(String patientname);
    public Prescription save(Prescription prescription);
}
