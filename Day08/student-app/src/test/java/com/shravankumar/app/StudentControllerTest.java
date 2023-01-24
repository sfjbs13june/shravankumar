package com.shravankumar.app;

import com.shravankumar.app.controller.StudentController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StudentControllerTest {
    StudentController studentController=new StudentController();

    @Test
    public void testList(){
        String listSize= String.valueOf(studentController.getStudent().size());
        Assert.assertEquals("3",listSize);
    }
    @Test
    public void testMap(){
        String mapSize=String.valueOf(studentController.mapStudents().size());
        Assert.assertEquals("3",mapSize);
    }
}