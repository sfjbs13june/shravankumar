package com.shravankumar.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyclassA {
    @Autowired
    MyclassB myclassB;

    @Autowired
    MyClassC myClassC;
    public String method1(){
    return "hello";
  }
  public String method2(){
        String str= myclassB.getResult();
        return str;
  }

    public int method3(int age){
        int result= myClassC.getMyAge(age);
        return age;
    }

    public String method4(String data){
        String str= myclassB.getMyString(data);
        return str;
    }

    public int method5(){
        int result= myclassB.getClassCRestult(myClassC);
        return result;
    }
    public void method6(){
        myclassB.NoreturnData("my data");

    }
}
