package com.shravankumar.app.controller;

import com.shravankumar.app.model.Prescription;
import com.shravankumar.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PrescriptionController {
    @Autowired
    PrescriptionRepository prescriptionRepository;
    @GetMapping("/viewprescription")
    public Prescription getallprescriptions(@RequestParam String patientName){
        return prescriptionRepository.findByPatientName(patientName);
    }
    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        return prescription = prescriptionRepository.save(prescription);
    }
}
