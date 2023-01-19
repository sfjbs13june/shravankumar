package com.shravankumar.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(Calculator.class)
public class CalculatorIntegrationTest
{

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCalculatorIntegrationAdd() throws Exception
    {
        String a = "5.0";
        String b = "5.0";
        ResultActions responseEntity = mockMvc.perform(get("/add").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String res=responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("10.0",res);
    }

    @Test
    public void testCalculatorIntegrationSub() throws Exception
    {
        String a = "5.0";
        String b = "5.0";
        ResultActions responseEntity = mockMvc.perform(get("/sub").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String res=responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("0.0",res);
    }

    @Test
    public void testCalculatorIntegrationMul() throws Exception
    {
        String a = "5.0";
        String b = "5.0";
        ResultActions responseEntity = mockMvc.perform(get("/mul").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String res=responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("25.0",res);
    }

    @Test
    public void testCalculatorIntegrationDiv() throws Exception
    {
        String a = "5.0";
        String b = "5.0";
        ResultActions responseEntity = mockMvc.perform(get("/div").param("a",a).param("b",b));
        responseEntity.andExpect(status().isOk());
        String res=responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(res);
        assertEquals("1.0",res);
    }
}
