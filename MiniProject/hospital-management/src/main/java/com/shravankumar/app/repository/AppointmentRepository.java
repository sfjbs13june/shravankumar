package com.shravankumar.app.repository;

import com.shravankumar.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface AppointmentRepository extends MongoRepository<Appointment,String> {
    public Appointment findByDoctorName(String doctorName);
    public Appointment findByPatientName(String patientName);
    public Appointment save(Appointment appointment);



}


