package com.shravankumar.app.controller;


import com.shravankumar.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PrescriptionController {
    private Map<String, Prescription> DoctorMap = new HashMap<String,Prescription>();

    @GetMapping("/view/prescription")
    public List<Prescription> getAllPrecription(@RequestParam String PatientName){

        List<Prescription> list  = new ArrayList<>();
        Prescription result = DoctorMap.get(PatientName);
        list.add(result);
        return list;

    }
    @PostMapping("/prescription/save")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        DoctorMap.put(prescription.getPrescriptionId(),prescription);
        return prescription;
    }
}