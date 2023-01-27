package com.shravankumar.app.controller;

import com.shravankumar.app.model.Appointment;
import com.shravankumar.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DoctorController {

    private Map<String,Appointment> DoctorMap = new HashMap<String,Appointment>();

    Prescription prescription1 = new Prescription("pre01","apt01","Cold and Cough","Rishi","Vinayak");
    Prescription prescription2 = new Prescription("pre02","apt02","headache","Mayank","Tarun");

    @RequestMapping("/doctor")
    public Map<String,Appointment> doctor(){
        Appointment appointment1 = new Appointment("apt01","Rishi","Vinayak","26-01-2023",prescription1);
        Appointment appointment2 = new Appointment("apt02","Mayank","Tarun","26-01-2023",prescription2);

        DoctorMap.put(appointment1.getAppointmentId(),appointment1);
        DoctorMap.put(appointment2.getAppointmentId(),appointment2);

        return DoctorMap;
    }


    @GetMapping("/doctor/appointment")
    public List<Appointment> getAppointment(@RequestParam String doctorName){

        Appointment appointment1 = new Appointment("apt01", "pat01", "Vinayak", "26-01-2023", prescription1);
        Appointment appointment2 = new Appointment("apt02","pat02","Tarun","26-01-2023",prescription2);
        DoctorMap.put(appointment1.getAppointmentId(),appointment1);
        DoctorMap.put(appointment2.getAppointmentId(),appointment2);

        List <Appointment> list = new ArrayList<>();
        Appointment result = DoctorMap.get(doctorName);
        System.out.println(result);
        list.add(result);
        return list;
    }
    @PostMapping("/doctor/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        System.out.println(appointment);
        return appointment;
    }

}