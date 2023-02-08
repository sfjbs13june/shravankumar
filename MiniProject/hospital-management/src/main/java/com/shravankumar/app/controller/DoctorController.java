package com.shravankumar.app.controller;

import com.shravankumar.app.model.Appointment;
import com.shravankumar.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    AppointmentRepository appointmentRepository;
    @GetMapping("/doctor-appointment")
    public Appointment getAppointments(@RequestParam String doctorName){
        return appointmentRepository.findByDoctorName(doctorName);
    }
    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
       return appointment=appointmentRepository.save(appointment);
    }

}
