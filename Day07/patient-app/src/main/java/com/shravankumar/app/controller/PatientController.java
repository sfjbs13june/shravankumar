package com.shravankumar.app.controller;

import com.shravankumar.app.exception.*;
import com.shravankumar.app.model.Patient;
import com.shravankumar.app.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {
    @Value("${app.name}")
    String name;
    @Autowired
    PatientService patientService;

    @PostMapping("/patient/save")
    public Patient savePatient(@RequestBody Patient patient) throws PatientIdNotFoundException, PatientNameNotFoundException, PatientAgeNotFoundException, PatientGenderNotFoundException, PatientDiseaseNotFoundException {
        if(patient.getId()==null){
            throw new PatientIdNotFoundException("Patient id is not available");
        }
        if(patient.getName()==null){
            throw new PatientNameNotFoundException("Patient name is not available");
        }
        if(patient.getAge()==null){
            throw new PatientAgeNotFoundException("Patient age is not available");
        }
        if(patient.getGender()==null){
            throw new PatientGenderNotFoundException("Patient gender is not available");
        }
        if(patient.getDisease()==null){
            throw new PatientDiseaseNotFoundException("Patient disease is not available");
        }

        System.out.println(name);
        System.out.println(patient);
        return patient;
    }


    @PutMapping("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient, @RequestParam("disease") String disease){
        return patientService.updateDetail(patient,disease);
    }
}