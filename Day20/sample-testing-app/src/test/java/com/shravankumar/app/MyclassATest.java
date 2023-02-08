package com.shravankumar.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MyclassATest {
    @InjectMocks
    MyclassA myclassA;
    @Mock
    MyclassB myclassB;

    @Mock
    MyClassC myclassC;
    @BeforeEach
    void setUp(){
        myclassB= Mockito.mock(MyclassB.class);
        myclassC= Mockito.mock(MyClassC.class);
    }
    @Test
    public void TestMethod1() {
        String result = myclassA.method1();
        assertEquals("hello", result);
    }

    @Test
    public void TestMethod2() {
        when(myclassB.getResult()).thenReturn("your result");
        String result = myclassA.method2();
        assertEquals("your result", result);
    }

    @Test
    public void TestMethod3() {
        when(myclassC.getMyAge(anyInt())).thenReturn(35);
        int result = myclassC.getMyAge(25);
        assertEquals(35, result);
    }

    @Test
    public void TestMethod4() {
        when(myclassB.getMyString(anyString())).thenReturn("your result with data");
        String result = myclassA.method4("data");
        assertEquals("your result with data", result);
    }

    @Test
    public void TestMethod5() {
        when(myclassB.getClassCRestult(any(MyClassC.class))).thenReturn(35);
        int result = myclassA.method5();
        assertEquals(35, result);
    }

    @Test
    public void TestMethod6() {
      //  doNothing().when(myclassB).NoreturnData(anyString());
        myclassA.method6();
        verify(myclassB, atLeast(1)).NoreturnData("my data");
    }
}