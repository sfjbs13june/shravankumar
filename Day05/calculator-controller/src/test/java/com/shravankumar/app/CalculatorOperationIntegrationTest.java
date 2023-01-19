package com.shravankumar.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@WebMvcTest(CalculatorOperation.class)

public class CalculatorOperationIntegrationTest
{
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void CalculatorOperationIntegrationTestAdd() throws Exception
    {
        long m = (long) 7.0;
        long s = (long) 8.0;
        ResultActions response = mockMvc.perform(get("/add").param("m", String.valueOf(m)).param("s", String.valueOf(s)));
        response.andExpect(status().isOk());
        String res = response.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("15",res);
    }

    @Test
    public void CalculatorOperationIntegrationTestSub() throws Exception
    {
        long m = (long) 10.0;
        long s = (long) 2.0;
        ResultActions response = mockMvc.perform(post("/sub").param("m", String.valueOf(m)).param("s", String.valueOf(s)));
        response.andExpect(status().isOk());
        String res = response.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("8",res);
    }

    @Test
    public void CalculatorOperationIntegrationTestMul() throws Exception
    {
        long m = (long) 10.0;
        long s = (long) 6.0;
        ResultActions response = mockMvc.perform(put("/mul").param("m",String.valueOf(m)).param("s",String.valueOf(s)));
        response.andExpect(status().isOk());
        String res = response.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("60",res);
    }

    @Test
    public void CalculatorOperationIntegrationTestDiv() throws Exception
    {
        long m = (long) 18.0;
        long s = (long) 3.0;
        ResultActions response = mockMvc.perform(delete("/div").param("m",String.valueOf(m)).param("s",String.valueOf(s)));
        response.andExpect((status().isOk()));
        String res = response.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("6",res);
    }
}