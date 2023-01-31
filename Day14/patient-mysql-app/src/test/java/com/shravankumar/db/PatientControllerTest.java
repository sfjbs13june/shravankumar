package com.shravankumar.db;

import com.shravankumar.db.controller.PatientController;
import com.shravankumar.db.model.Patient;
import com.shravankumar.db.repository.PatientRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PatientControllerTest {
    @InjectMocks
    private PatientController patientController;

    @Mock
    private PatientRepository patientRepository;

    @Test
    public void getAllTest(){
        Patient p1=new Patient();
        p1.setId(1);
        p1.setName("raju");
        p1.setAge(25);
        p1.setGender("Male");
        p1.setDisease("Malaria");

        List<Patient> patientList=new ArrayList<>();
        patientList.add(p1);
        when(patientRepository.findAll()).thenReturn(patientList);
        List<Patient> results= (List<Patient>) patientController.getAll();
        Patient result =results.get(0);
        assertEquals(1,result.getId());
        assertEquals("raju",result.getName());
        assertEquals(25,result.getAge());
        assertEquals("Male",result.getGender());
        assertEquals("Malaria",result.getDisease());
    }

    @Test
    public void storeTest(){

    }
}
