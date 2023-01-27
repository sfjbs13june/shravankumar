package com.shravankumar.app.controller;

import com.shravankumar.app.model.Appointment;
import com.shravankumar.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientController {

    private Map<String,Appointment> DoctorMap= new HashMap<String,Appointment>();

    Prescription prescription1 = new Prescription("pre01","apt01","Cold and Cough","Rishi","Vinayak");
    Prescription prescription2 = new Prescription("prep02","apt02","headache","Mayank","Tarun");

    @RequestMapping("/patient")
    public Map getPatient(){

        Appointment appointment1 = new Appointment("apt01","Rishi","Vinayak","26-01-2023",prescription1);
        Appointment appointment2 = new Appointment("apt02","Mayank","Tarun","26-01-2023",prescription2);

        DoctorMap.put(appointment1.getAppointmentId(),appointment1);
        DoctorMap.put(appointment2.getAppointmentId(),appointment2);

        return DoctorMap;
    }

    @GetMapping("/patient/myappointment")
    public List<Appointment> getMyAppointment(@RequestParam String patientName){

        List<Appointment> list = new ArrayList<>();
        Appointment result = DoctorMap.get(patientName);
        list.add(result);

        return list;

    }

    @PostMapping("/patient/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){

        return appointment;

    }

}