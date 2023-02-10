package com.shravankumar.app;


import com.shravankumar.app.controller.DoctorController;
import com.shravankumar.app.model.Appointment;
import com.shravankumar.app.model.Prescription;
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
        List<Appointment> appointments=new ArrayList();
        Appointment appointment1=new Appointment();
        Prescription prescription1=new Prescription();
        appointment1.setAppointmentId("987");
        appointment1.setDoctorName("doc6");
        appointment1.setDate("9th, jan");
        appointment1.setPatientName("pat2");
        appointment1.setPrescription(prescription1);
        appointments.add(appointment1);
        Mockito.when(appointmentRepository.findByDoctorName(ArgumentMatchers.anyString())).thenReturn(appointments);
        List<Appointment> result=doctorController.getAppointments("abc");
        assertEquals(appointments.size(),1);
        assertEquals(appointments.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(appointments.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(appointments.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(appointments.get(0).getDate(),result.get(0).getDate());


    }

    @Test
    public void Test2(){
        Appointment ap1=new Appointment();
        Mockito.when(appointmentRepository.save(ArgumentMatchers.any(Appointment.class))).thenReturn(ap1);
        Appointment result=doctorController.saveAppointment(appointment);
        Assertions.assertEquals(ap1,result);
    }

}