package com.shravankumar.app.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

public class Patient {

        private String patientName;
        private String patId;

        private String gender;
        private String age;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatId() {
        return patId;
    }

    public void setPatId(String patId) {
        this.patId = patId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


        @Override
        public String toString() {
            return "Patient [Name=" + patientName + ", Patient Id=" + patId + ", Age=" + age+ ", Gender="+gender+"]";

        }

}
