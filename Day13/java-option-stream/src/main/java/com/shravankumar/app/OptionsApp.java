package com.shravankumar.app;

import com.shravankumar.app.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionsApp {

    public Optional<Hospital> getHospital(String name){

        Hospital hospital1= new Hospital("c1","3");
        Hospital hospital2=new Hospital("c2","4");
        Map<String, Hospital> data = new HashMap<>();
        data.put("c1", hospital1);
        data.put("c2", hospital2);
        Hospital result= data.get(name);
        return Optional.ofNullable(result);

    }
}