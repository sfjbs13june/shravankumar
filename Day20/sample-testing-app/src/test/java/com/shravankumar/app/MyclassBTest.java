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
public class MyclassBTest {
    @InjectMocks
    MyclassB myclassB;
    @Mock
    MyclassA myclassA;

    @Mock
    MyClassC myclassC;

    @BeforeEach
    void setUp() {
        myclassA = Mockito.mock(MyclassA.class);
        myclassC = Mockito.mock(MyClassC.class);
    }

    @Test
    public void TestgetResult() {
        String result = myclassB.getResult();
        assertEquals("my result", result);
    }


    @Test
    public void TestgetMyResult() {
        String result = myclassB.getMyString(" hello");
        assertEquals("my result hello", result);
    }


    @Test
    public void TestgetClassCRestult() {
        when(myclassC.getMyAge(anyInt())).thenReturn(35);
        int result = myclassC.getMyAge(25);
        assertEquals(35, result);
    }
    @Test
    public void TestNoreturnData()
    {
        myclassB.NoreturnData("my data");
        String result = "my data";
        assertEquals("my data",result);
    }

}

