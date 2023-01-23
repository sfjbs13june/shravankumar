package com.shravankumar.app.controller;

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
    public Patient savePatient(@RequestBody Patient patient){
        System.out.println(name);
        System.out.println(patient);
        return patient;
    }
    @PutMapping("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient, @RequestParam("disease") String disease, @RequestParam("age") String age){
        return patientService.updateDetail(patient,disease,age);
    }

}
