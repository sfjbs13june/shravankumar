package com.shravankumar.app;


import com.shravankumar.app.controller.DoctorController;
import com.shravankumar.app.model.Appointment;
import com.shravankumar.app.repository.AppointmentRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DoctorControllerTest {
    @InjectMocks
    private DoctorController doctorController;
    @Mock
    Appointment appointment;
    @Mock
    AppointmentRepository appointmentRepository;
    @BeforeEach
    void setUp(){
        appointment= Mockito.mock(Appointment.class);
        appointmentRepository=Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public void Test1(){
        List test=new ArrayList();
        Mockito.when(appointmentRepository.findByDoctorName(ArgumentMatchers.anyString())).thenReturn(test);
        List result=doctorController.getAppointments("abc");
        Assertions.assertEquals(test,result);
    }

    @Test
    public void Test2(){
        Appointment ap1=new Appointment();
        Mockito.when(appointmentRepository.save(ArgumentMatchers.any(Appointment.class))).thenReturn(ap1);
        Appointment result=doctorController.saveAppointment(appointment);
        Assertions.assertEquals(ap1,result);
    }

}