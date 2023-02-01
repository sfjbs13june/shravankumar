package com.mongo.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/patient")
public class PatientController {
  @Autowired
  PatientRepository patientRepo;

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Patient create(@RequestBody Patient patient) {
    patient =  patientRepo.save( patient);
    return  patient;
  }

  @RequestMapping(value = "/read", method = RequestMethod.GET)
  public List<Patient> readPatient(){
    return  patientRepo.findAll();
  }

  @RequestMapping(value = "/update", method = RequestMethod.PUT)
  public void modifyByID(@RequestParam String patId, @RequestParam String name) {
    Patient  patient =  patientRepo.findByName(name);
    patient.setPatId(patId);
    patientRepo.save( patient);
  }

  @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
  public void deleteByID(@RequestParam String name) {
    patientRepo.deleteByname(name);
  }

  @RequestMapping(value = "/findByid", method = RequestMethod.GET)
  public void findByID(@RequestParam String patId) {
    patientRepo.findBypatId(patId);
  }

}
