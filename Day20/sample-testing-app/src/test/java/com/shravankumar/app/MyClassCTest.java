package com.shravankumar.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MyClassCTest {
    @InjectMocks
    MyClassC myclassC;

    @Test
    public void TestgetMyAge()
    {
        int result = myclassC.getMyAge(23);
        assertEquals(23, result);
    }
}
