package com.shravankumar.app.repository;

import com.shravankumar.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AppointmentRepository extends MongoRepository<Appointment,String> {
    public List<Appointment> findByDoctorName(String doctorName);
    public List<Appointment> findByPatientName(String patientName);
    public Appointment save(Appointment appointment);



}


