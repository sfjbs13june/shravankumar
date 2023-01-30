package com.shravankumar.app;

import com.shravankumar.app.model.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class App
{
    public static void main( String[] args )
    {
        OptionsApp optionsApp=new OptionsApp();


        optionsApp.getHospital("c3").ifPresent(hospital-> System.out.println(hospital.getName()));

        StreamApp streamApp=new StreamApp();
        System.out.println("employee Array");
        streamApp.getEmployeeArray().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee List");
        streamApp.getEmployeeList().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee Data");
        streamApp.getEmployeeData().forEach(employee -> System.out.println(employee.toString()));
        System.out.println("employee builder");
        streamApp.getEmployeeStreamBulider().forEach(employee -> System.out.println(employee.toString()));
        streamApp.getEmployeeList().forEach(e -> e.salaryIncrement(10.0));
        streamApp.getEmployeeStreamBulider().forEach(employee -> System.out.println(employee.toString()));

    }
}